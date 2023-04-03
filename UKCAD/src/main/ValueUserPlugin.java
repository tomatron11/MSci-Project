import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtNewConstructor;
import javassist.NotFoundException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javafx.scene.shape.*;
import javafx.scene.transform.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.PickResult;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.image.Image; 


/** 
   * @implements ValueUserPluginInterface
   * 
   * Plugin class that builds and runs UKCAD with the passed program values
   */
public class ValueUserPlugin implements ValueUserPluginInterface {
  private final int windowX = 1200; // Default window size
  private final int windowY = 600;
  private double xAngle; // Variables to hold current angle of camera
  private double yAngle;
  private double zAngle;
  private Box xAxis; // Axes
  private Box yAxis;
  private Box zAxis;
  public HashMap<String, Shape3D> shapes = new HashMap<String, Shape3D>(); // Holds shapes
  public HashMap<String, CtClass> ctclasses = new HashMap<String, CtClass>(); // Holds custom classes before they are loaded
  public HashMap<String, Class<?>> classes = new HashMap<String, Class<?>>(); // Holds custom classes after they are loaded
  public HashMap<String, String> classTransforms = new HashMap<String, String>(); // Holds code to insert into custom class constructor
  private final Stage stage = new Stage();
  private final Group group = new Group();
  private final SubScene scene = new SubScene(group, windowX*0.7, windowY, true, SceneAntialiasing.BALANCED); // 3D scene
  private static Boolean fullScreen = false;
  private static File currFile; // Opened file
  private final String filePath = "C:\\Users\\tomwi\\Documents\\Final Year Project\\PROJECT\\UKCAD\\";
  private final File saveFile = new File(filePath.concat("src\\main\\temp\\currentFile.txt"));
  // Saves file path of opened file for new instance to read
 
  /** 
   * @return String
   * 
   * Overridden method specified by ValueUserPluginInterface
   * Returns name of plugin
   */
  @Override
  public String name() {
      return "UKCAD JavaFx Plugin";
  }

  
  /** 
   * @param args
   * @return Value
   * @throws ARTException
   * 
   * Overridden method specified by ValueUserPluginInterface
   * args are Values passed from program
   * Sets up UKCAD
   */
  @Override
  public Value user(Value... args) throws ARTException {
    // Performs a function depending on the corresponding statement
    switch(args[0].value().toString()) {
      case "sphere":
      drawSphere(args);
      break;
      case "cuboid":
      drawCuboid(args);
      break;
      case "cylinder":
      drawCylinder(args);
      break;
      case "pyramid":
      setupShape(new MeshView(drawPyramid(args)), toInnerString(args[1]));
      break;
      case "triprism":
      setupShape(new MeshView(drawTriPrism(args)), toInnerString(args[1]));
      break;
      case "cone":
      setupShape(new MeshView(drawCone(args)), toInnerString(args[1]));
      break;
      case "tetra":
      setupShape(new MeshView(drawTetra(args)), toInnerString(args[1]));
      break;
      case "trapprism":
      setupShape(new MeshView(drawTrapPrism(args)), toInnerString(args[1]));
      break;
      case "subClass":
      subClass(args);
      break;
      case "object":
      newObject(args);
      break;
      case "objects":
      newObjects(args);
      break;
      case "addTransform":
      addTransform(args);
      break;
      case "colour":
      colour(shapes.get(toInnerString(args[1])), args);
      break;
      case "translate":
      translate(shapes.get(toInnerString(args[1])), args);
      break;
      case "translateAll":
      translateAll(args);
      break;
      case "rotate":
      rotate(shapes.get(toInnerString(args[1])), args);
      break;
      case "rotateAll":
      rotateAll(args);
      break;
      case "scale":
      scale(shapes.get(toInnerString(args[1])), args);
      break;
      case "isFilled":
      isfilled(shapes.get(toInnerString(args[1])), args);
      break;
      case "texture":
      texture(shapes.get(toInnerString(args[1])), args);
      break;
      case "opacity":
      opacity(shapes.get(toInnerString(args[1])), args);
      break;
    }

    Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
    Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
    Rotate zRotate = new Rotate(0, Rotate.Z_AXIS);
    PerspectiveCamera camera = setUpCamera(xRotate, yRotate, zRotate); 
    Group root = new Group();
    Scene main = new Scene(root, windowX, windowY); // main scene containing editor and 3D subscene
    SubScene editor = buildEditor(main);
    root.getChildren().addAll(scene, editor);
    
    if (saveFile.length() != 0) {
      try {
        Scanner scanner = new Scanner(saveFile);
        String path = scanner.nextLine();
        currFile = new File(path);
        scanner.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
    
    // Registers key inputs
    main.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.S) {
        xAngle += 5.0;
        xRotate.setAngle(xAngle);
      }
      if (e.getCode() == KeyCode.W) {
        xAngle -= 5.0;
        xRotate.setAngle(xAngle);
      }
      if (e.getCode() == KeyCode.A) {
        yAngle += 5.0;
        yRotate.setAngle(yAngle);
      }
      if (e.getCode() == KeyCode.D) {
        yAngle -= 5.0;
        yRotate.setAngle(yAngle);
      }
      if (e.getCode() == KeyCode.Q) {
        zAngle += 5.0;
        zRotate.setAngle(zAngle);
      }
      if (e.getCode() == KeyCode.E) {
        zAngle -= 5.0;
        zRotate.setAngle(zAngle);
      }
      if (e.getCode() == KeyCode.H) { // Resets camera
        xRotate.setAngle(0);
        yRotate.setAngle(0);
        zRotate.setAngle(0);
        xAngle = 0;
        yAngle = 0;
        zAngle = 0;
      }
      if (e.getCode() == KeyCode.F) { // Toggles axes
        if (group.getChildren().contains(xAxis) == false) {
          buildAxes();
        } else {
          group.getChildren().removeAll(xAxis, yAxis, zAxis);
        }
      }
      if (e.getCode() == KeyCode.ESCAPE && fullScreen == true) {
        scene.setWidth(windowX*0.7);
        scene.setHeight(windowY);
        editor.setVisible(true);
        stage.setFullScreen(false);
        fullScreen = false;
      }
    });

    main.setOnScroll(e -> { 
      if (e.getDeltaY() > 0) {
        camera.getTransforms().add(new Translate(camera.getTranslateX(), camera.getTranslateY(), camera.getTranslateZ()+15));
      } else if (e.getDeltaY() < 0) {
        camera.getTransforms().add(new Translate(camera.getTranslateX(), camera.getTranslateY(), camera.getTranslateZ()-15));
      }
    });

    scene.setPickOnBounds(true);
    scene.setOnMouseClicked(e -> { 
      scene.requestFocus(); // Swaps focus back to 3D scene when clicked on
      PickResult pr = e.getPickResult();
      if (pr.getIntersectedNode() instanceof Shape3D && pr.getIntersectedNode() != xAxis && pr.getIntersectedNode() != yAxis 
      && pr.getIntersectedNode() != zAxis) {
        displayShapeInfo((Shape3D) pr.getIntersectedNode());
      }
    });

    stage.setResizable(false);
    stage.setScene(main);
    stage.setTitle("UKCAD");
    stage.show();

    return new __done();
  }

  
  /** 
   * @param xRotate
   * @param yRotate
   * @param zRotate
   * @return PerspectiveCamera
   * 
   * Sets up camera for 3D scene
   */
  private PerspectiveCamera setUpCamera(Rotate xRotate, Rotate yRotate, Rotate zRotate) {
    PerspectiveCamera camera = new PerspectiveCamera(true);
    scene.setCamera(camera);
    Translate pivot = new Translate();
    camera.getTransforms().addAll (
            pivot,
            xRotate,
            yRotate,
            zRotate,
            new Translate(0, 0, -700)
    );
    camera.setNearClip(1);
    camera.setFarClip(10000);
    group.getChildren().add(camera);
    return camera;
  }


  /**
   * Builds axes when toggled 
   */
  private void buildAxes() {
    xAxis = new Box(5000, 1, 1);
    yAxis = new Box(1, 5000, 1);
    zAxis = new Box(1, 1, 5000);
    xAxis.setMaterial(new PhongMaterial(Color.RED));
    yAxis.setMaterial(new PhongMaterial(Color.GREEN));
    zAxis.setMaterial(new PhongMaterial(Color.BLUE));
    group.getChildren().addAll(xAxis, yAxis, zAxis);
  }

  
  /** 
   * @param main
   * @return SubScene
   * 
   * Builds editor at the side of UKCAD
   */
  private SubScene buildEditor(Scene main) {
    VBox root = new VBox(10);
    root.setAlignment(Pos.CENTER);
    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(0, 10, 0, 10));
    SubScene editor = new SubScene(root, windowX*0.3, windowY);
    editor.setLayoutX(windowX*0.7);
    TextArea codeArea = new TextArea();
    codeArea.setPrefSize(windowX*0.3, windowY*0.75);
    File file = new File(filePath.concat("src\\main\\UKCAD_Interpreter.str"));
    readFile(file, codeArea);
    Label label = new Label();
    if (currFile == null) { 
      label.setText("File: None"); 
    } else {  
      label.setText("File: ".concat(currFile.getName()));
    }
    Button openFile = new Button("Open File");
    openFile.setOnAction(e -> { chooseFile(codeArea, label); });
    Button run = new Button("Save & Run");
    run.setOnAction(e -> { writeFile(currFile, codeArea); writeAndRun(file, codeArea); });
    Button export = new Button("Export File");
    export.setOnAction(e -> { exportFile(codeArea, label); });
    Button fullScreen = new Button("Fullscreen");
    fullScreen.setOnAction(e -> { expandStage(editor); });
    Button spec = new Button("Specification");
    spec.setOnAction(e -> { buildDocumentation(new File(filePath.concat("documentation\\UKCAD Specification.txt")), main); });
    Button sigs = new Button("Signatures");
    sigs.setOnAction(e -> { buildDocumentation(new File(filePath.concat("documentation\\UKCAD Signatures.txt")), main); });
    Button controls = new Button("Controls");
    controls.setOnAction(e -> { buildDocumentation(new File(filePath.concat("documentation\\UKCAD Controls.txt")), main); });
    grid.add(fullScreen, 0, 0);
    grid.add(label, 3, 1);
    grid.add(openFile, 3, 2);
    grid.add(export, 3, 3);
    grid.add(controls, 1, 1);
    grid.add(spec, 1, 2);
    grid.add(sigs, 1, 3);
    root.getChildren().addAll(grid, codeArea, run);
    return editor;
  }

  
  /** 
   * @param file
   * @param main
   * 
   * Builds documentation view reading given file
   */
  private void buildDocumentation(File file, Scene main) {
    VBox vbox = new VBox();
    Scene doc = new Scene(vbox, windowX, windowY);
    TextArea text = new TextArea();
    text.setPrefSize(windowX, windowY);
    text.setEditable(false);
    readFile(file, text);
    Button back = new Button("Back");
    back.setOnAction(e -> { stage.setScene(main); });
    vbox.getChildren().addAll(back, text);
    stage.setScene(doc);
  }

  
  /** 
   * @param editor
   * 
   * Expands 3D scene when fullscreened
   */
  private void expandStage(SubScene editor) {
    editor.setVisible(false);
    Rectangle2D screen = Screen.getPrimary().getBounds();
    scene.setWidth(screen.getWidth());
    scene.setHeight(screen.getHeight());
    stage.setFullScreen(true);
    fullScreen = true;
  }

  
  /** 
   * @param codeArea
   * @param label
   * 
   * Opens file chooser and opens file
   * Writes file contents to codeArea
   * Sets currFile
   */
  private void chooseFile(TextArea codeArea, Label label) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Open Program File");
    fileChooser.getExtensionFilters().add(new ExtensionFilter("Program Files", "*.str"));
    File selectedFile = fileChooser.showOpenDialog(stage);
    if (selectedFile == null) { return; }
    currFile = selectedFile;
    readFile(selectedFile, codeArea);
    label.setText("File: ".concat(currFile.getName()));
    try (PrintWriter writer = new PrintWriter(saveFile)) {
        writer.write(currFile.getPath());
    } catch (IOException e) {
        e.printStackTrace();
    }  
}


/** 
 * @param file
 * @param codeArea
 * 
 * Reads passed file's contents and writes into passed codeArea
 */
private void readFile(File file, TextArea codeArea) {
  if (file == null) {
    return;
  }
  try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
          sb.append(line);
          sb.append(System.lineSeparator());
          line = br.readLine();
      }
      codeArea.setText(sb.toString());
  } catch (IOException e) {
      e.printStackTrace();
  }
}

  
  /** 
   * @param file
   * @param codeArea
   * 
   * Writes file with contents of codeArea
   */
  private void writeFile(File file, TextArea codeArea) {
    if (file == null) {
      return;
    }
    try (FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bwriter = new BufferedWriter(fwriter)) {
      bwriter.write(codeArea.getText());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @param file
   * @param codeArea
   * 
   * Calls writeFile and reruns plugin with new program file
   */
  private void writeAndRun(File file, TextArea codeArea) {
    try {
      writeFile(file, codeArea);
      if (currFile != null) {
        try (PrintWriter writer = new PrintWriter(saveFile)) {
          writer.write(currFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }  
      }
      Runtime.getRuntime().exec("cmd.exe /c reparsefx.bat UKCAD_Interpreter");
      stage.close();
    } catch (SecurityException | IllegalArgumentException | IOException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @param codeArea
   * @param label
   * 
   * Exports file by selecting file and writing contents of codeArea
   */
  private void exportFile(TextArea codeArea, Label label) {
    FileChooser fchooser = new FileChooser();
    fchooser.setTitle("Export File");
    fchooser.getExtensionFilters().addAll(new ExtensionFilter("Program Files", "*.str"));
    File selectedFile = fchooser.showSaveDialog(stage);
    if (selectedFile == null) { return; }
    writeFile(selectedFile, codeArea);
    currFile = selectedFile;
    label.setText("File: ".concat(currFile.getName()));
  }

  
  /** 
   * @param shape
   * 
   * Displays shape label containing ID and coordinates upon click
   * Removes other labels currently being shown
   * Removes this label if only label being shown and same shape clicked
   */
  private void displayShapeInfo(Shape3D shape) {
    StringBuilder sb = new StringBuilder();
    sb.append(getName(shape).concat(System.lineSeparator()));
    sb.append("x:".concat(String.valueOf(shape.getTranslateX())).concat(", "));
    sb.append("y:".concat(String.valueOf(-shape.getTranslateY())).concat(", "));
    sb.append("z:".concat(String.valueOf(shape.getTranslateZ())));
    Label label = new Label(sb.toString());
    label.setTranslateX(shape.getTranslateX());
    label.setTranslateY(shape.getTranslateY() + shape.getLayoutBounds().getHeight());
    label.setTranslateZ(shape.getTranslateZ());
    Rotate xRotate = new Rotate(xAngle, Rotate.X_AXIS);
    Rotate yRotate = new Rotate(yAngle, Rotate.Y_AXIS);
    Rotate zRotate = new Rotate(zAngle, Rotate.Z_AXIS);
    label.getTransforms().addAll(xRotate, yRotate, zRotate);
    for (Object obj: group.getChildren()) {
      if (obj instanceof Label) {
        Label oldLabel = (Label) obj;
        if (oldLabel.getText().equals(label.getText()) && oldLabel.isVisible()) {
          oldLabel.setVisible(false);
          return;
        }
        oldLabel.setVisible(false);
      }
    }
    group.getChildren().add(label);
  }

  
  /** 
   * @param shape
   * @return String
   * 
   * Gets name of shape passed
   * Used by displayShapeInfo
   */
  private String getName(Shape3D shape) {
    for (String name: shapes.keySet()) {
      if (shapes.get(name).equals(shape)) {
        return name;
      }
    }
    return null;
  }

  
  /** 
   * @param value
   * @return float
   * @throws ARTException
   * 
   * Gets inner float from passed Value
   */
  private float toFloat(Value value) throws ARTException {
    return Float.valueOf(value.value().toString());
  }

  
  /** 
   * @param value
   * @return int
   * @throws ARTException
   * 
   * Gets inner int from passed Value
   */
  private int toInt(Value value) throws ARTException {
    return Integer.valueOf(value.value().toString());
  }


  /** 
   * @param value
   * @return String
   * @throws ARTException
   * 
   * Gets inner String from passed Value
   */
  private String toInnerString(Value value) throws ARTException {
    if (value.toString().charAt(0) == '_') {
      return value.value().toString();
    } else {
      return value.toString();
    }
  }

  
  /** 
   * @param shape
   * @param name
   * 
   * Sets shape to coordinates 0,0,0 and adds to the Group and shapes HashMap
   */
  private void setupShape(Shape3D shape, String name) {
    shape.setTranslateX(0);
    shape.setTranslateY(0);
    shape.setTranslateZ(0);
    shapes.put(name, shape);
    group.getChildren().add(shape);
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Creates Sphere object
   */
  public void drawSphere(Value[] args) throws ARTException {
    Sphere sphere = new Sphere(toFloat(args[2])/2); 
    setupShape(sphere, toInnerString(args[1]));
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Creates Cuboid object
   */
  public void drawCuboid(Value[] args) throws ARTException {
    Box box = new Box(toFloat(args[2]), toFloat(args[3]), toFloat(args[4]));
    setupShape(box, toInnerString(args[1]));
  }


  /** 
   * @param args
   * @throws ARTException
   * 
   * Creates Cylinder object
   */
  public void drawCylinder(Value[] args) throws ARTException {
    Cylinder cylinder = new Cylinder(toFloat(args[3])/2, toFloat(args[2]));
    setupShape(cylinder, toInnerString(args[1]));
  }

  
  /** 
   * @param args
   * @return TriangleMesh
   * @throws ARTException
   * 
   * Returns Pyramid mesh object from passed args
   */
  public TriangleMesh drawPyramid(Value[] args) throws ARTException {
    TriangleMesh mesh = new TriangleMesh();
    final float x = toFloat(args[2]);
    final float y = toFloat(args[3]);
    final float z = toFloat(args[4]);
    mesh.getPoints().addAll(
      0,-y/2,0,
      x/2,y/2,z/2,
      x/2,y/2,-z/2,
      -x/2,y/2,-z/2,
      -x/2,y/2,z/2);
    mesh.getTexCoords().addAll(0,0, 0,1, 1,0, 1,1, (float) 0.5,(float)0.5);
    mesh.getFaces().addAll(
        0,0, 3,1, 2,4, 
        0,0, 2,2, 1,4, 
        0,2, 1,3, 4,4, 
        0,3, 4,1, 3,4, 
        2,0, 3,3, 4,1, 
        2,0, 4,3, 1,2);  
    return mesh;
  }

  
  /** 
   * @param args
   * @return TriangleMesh
   * @throws ARTException
   * 
   * Returns Triangular Prism mesh object from passed args
   */
  public TriangleMesh drawTriPrism(Value[] args) throws ARTException {
    TriangleMesh mesh = new TriangleMesh();
    final float x = toFloat(args[2]);
    final float y = toFloat(args[3]);
    final float z = toFloat(args[4]);
    mesh.getPoints().addAll(
      x/2,y/2,-z/2,
      -x/2,y/2,-z/2,
      0,-y/2,-z/2,
      x/2,y/2,z/2,
      -x/2,y/2,z/2,
      0,-y/2,z/2);
    mesh.getTexCoords().addAll(0,0, 0,1, 1,0, 1,1, (float)0.5,(float)0.5);
    mesh.getFaces().addAll(
      0,0, 2,1, 1,4,
      3,2, 4,3, 5,4,
      0,0, 3,3, 2,1,
      2,0, 3,3, 5,2,
      1,0, 2,3, 4,1,
      4,0, 2,3, 5,2,
      0,0, 1,3, 3,1,
      1,0, 4,3, 3,2);
    return mesh;
  }

  
  /** 
   * @param args
   * @return TriangleMesh
   * @throws ARTException
   * 
   * Returns Cone mesh object from passed args
   * Partially taken from Draw3D library by edisonwj found at https://github.com/edisonwj/Draw3D
   */
  public TriangleMesh drawCone(Value[] args) throws ARTException {
    TriangleMesh mesh = new TriangleMesh();
    final float r = toFloat(args[2])/2;
    final float h = toFloat(args[3]);
    final int div = 12;
    double theta = 2.0*Math.PI;
    final double decrement = 2.0*Math.PI/div;
    float xf = 0.0f;
		float yf = 0.0f;
		for (int i = div; i > 0; i--) {
			xf = (float)(r*Math.cos(theta));
			yf = (float)(r*Math.sin(theta));
			mesh.getPoints().addAll(xf, h/2, yf);
			theta = theta - decrement;
		}
		mesh.getPoints().addAll(0, h/2, 0);
		mesh.getPoints().addAll(0, -h/2, 0);
		mesh.getTexCoords().addAll(0,0, 0,1, 1,0, 1,1);
		for (int i = 0; i < div; i++) {
			mesh.getFaces().addAll(
					div,0,(i+1)%div,3,i,1,
					div+1,0,i,3,(i+1)%div,2);
		}
    return mesh;
  }

  
  /** 
   * @param args
   * @return TriangleMesh
   * @throws ARTException
   * 
   * Returns Tetrahedron mesh object from passed args
   */
  public TriangleMesh drawTetra(Value[] args) throws ARTException {
    TriangleMesh mesh = new TriangleMesh();
    final float x = toFloat(args[2]);
    final float y = toFloat(args[3]);
    final float z = toFloat(args[4]);
    mesh.getPoints().addAll(
      x/2,y/2,-z/2,
      -x/2,y/2,-z/2,
      0,y/2,z/2,
      0,-y/2,0
    );
    mesh.getTexCoords().addAll(0,0, 0,1, 1,0, 1,1, (float)0.5,(float)0.5);
    mesh.getFaces().addAll(
      0,0, 3,4, 1,1,
      3,0, 0,4, 2,2,
      1,2, 3,4, 2,3,
      1,3, 2,4, 0,1
    );
    return mesh;
  }

  
  /** 
   * @param args
   * @return TriangleMesh
   * @throws ARTException
   * 
   * Returns Trapezium Prism mesh object from passed args
   */
  public TriangleMesh drawTrapPrism(Value[] args) throws ARTException {
    TriangleMesh mesh = new TriangleMesh();
    final float bx = toFloat(args[2]);
    final float tx = toFloat(args[3]);
    final float y = toFloat(args[4]);
    final float z = toFloat(args[5]);
    mesh.getPoints().addAll(
      -tx/2,-y/2,z/2,
      -tx/2,-y/2,-z/2,
      -bx/2,y/2,z/2,
      -bx/2,y/2,-z/2,
      tx/2,-y/2,-z/2,
      tx/2,-y/2,z/2,
      bx/2,y/2,-z/2,
      bx/2,y/2,z/2,
      -tx/2,y/2,-z/2,
      tx/2,y/2,-z/2,
      -tx/2,y/2,z/2,
      tx/2,y/2,z/2
    );
    mesh.getTexCoords().addAll(0,0, 0,1, 1,0, 1,1, (float)0.5,(float)0.5);
    mesh.getFaces().addAll(
      0,0, 2,4, 1,1,
      1,0, 2,4, 3,2,
      4,2, 6,4, 5,3,
      5,3, 6,4, 7,1,
      1,0, 3,4, 8,1,
      4,0, 1,2, 8,4,
      4,2, 8,4, 9,3,
      4,3, 9,4, 6,1,
      0,0, 10,4, 2,1,
      0,2, 5,4, 10,3,
      5,3, 11,4, 10,1,
      5,0, 7,4, 11,1,
      0,0, 1,4, 5,2,
      5,2, 1,4, 4,3,
      2,3, 7,4, 3,1,
      7,0, 6,1, 3,4
    );
    return mesh;
  }
  
  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Creates subclass from given Shape3D class and adds to CtClasses HashMap
   */
  public void subClass(Value[] args) throws ARTException {
    try {
      String arg1 = toInnerString(args[1]);
      String arg2 = toInnerString(args[2]);
      ClassPool pool = ClassPool.getDefault();
      pool.importPackage("uk.ac.rhul.cs.csle.art.value"); // Needs to be imported to use Value type
      CtClass subClass = pool.makeClass(arg1);
      subClass.defrost();
      CtClass superClass;
      CtConstructor ctconstruct;
      switch (arg2) {
        case "Sphere":
          superClass = pool.get(Sphere.class.getName());
          subClass.setSuperclass(superClass);
          subClass.setModifiers(Sphere.class.getModifiers());
          ctconstruct = CtNewConstructor.make(new CtClass[]{pool.get(double.class.getName())}, null, subClass);
          subClass.addConstructor(ctconstruct);
          break;
        case "Cuboid":
          superClass = pool.get(Box.class.getName());
          subClass.setSuperclass(superClass);
          subClass.setModifiers(Box.class.getModifiers());
          CtClass db = pool.get(double.class.getName());
          ctconstruct = CtNewConstructor.make(new CtClass[]{db,db,db}, null, subClass);
          subClass.addConstructor(ctconstruct);
          break;
        case "Cylinder":
          superClass = pool.get(Cylinder.class.getName());
          subClass.setSuperclass(superClass);
          subClass.setModifiers(Cylinder.class.getModifiers());
          db = pool.get(double.class.getName());
          ctconstruct = CtNewConstructor.make(new CtClass[]{db,db}, null, subClass);
          subClass.addConstructor(ctconstruct);
          break;
        case "Pyramid":
        case "TriPrism":
        case "Cone":
        case "Tetra":
        case "TrapPrism":
          if (pool.getOrNull(arg2) == null) {
            CtClass ctcls = pool.makeClass(arg2);
            ctcls.defrost();
            superClass = pool.get(MeshView.class.getName());
            ctcls.setSuperclass(superClass);
            subClass.setSuperclass(ctcls);
            subClass.setModifiers(ctcls.toClass(ValueUserPlugin.class).getModifiers());
          } else {
            CtClass ctcls = pool.get(arg2);
            subClass.setSuperclass(ctcls);
            subClass.setModifiers(ctcls.getClass().getModifiers());
          }
          ctconstruct = CtNewConstructor.make(new CtClass[]{pool.get(Mesh.class.getName())}, null, subClass);
          subClass.addConstructor(ctconstruct);
          break;
      }
      classTransforms.put(arg1, "ValueUserPlugin plugin = new ValueUserPlugin();");
      if (args.length > 3) { // If transform given
        String arg3 = toInnerString(args[3]);
        Value[] shortArgs = Arrays.copyOfRange(args, 4, args.length);
        StringBuilder insert = new StringBuilder("plugin.".concat(arg3.toLowerCase() + "(this, new Value[]{new __real64(0.0),new __real64(0.0),"));
        for (Value arg: shortArgs) {
          insert.append("new __string(\"" + toInnerString(arg) + "\")");
          if (arg != shortArgs[shortArgs.length-1]) {
            insert.append(",");
          }
        }
        insert.append("});");
        String insertString = insert.toString();
        classTransforms.put(arg1, "ValueUserPlugin plugin = new ValueUserPlugin();" + insertString);
      } 
      ctclasses.put(arg1, subClass);
    } catch (NotFoundException | CannotCompileException | IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Adds transform to already existing subclass
   */
  public void addTransform(Value[] args) throws ARTException {
    try {
      String arg1 = toInnerString(args[1]);
      String arg2 = toInnerString(args[2]);
      Value[] shortArgs = Arrays.copyOfRange(args, 3, args.length);
      StringBuilder insert = new StringBuilder("plugin.".concat(arg2.toLowerCase() + "(this, new Value[]{new __real64(0.0),new __real64(0.0),"));
      for (Value arg: shortArgs) {
        insert.append("new __string(\"" + toInnerString(arg) + "\")");
        if (arg != shortArgs[shortArgs.length-1]) {
          insert.append(", ");
        }
      }
      insert.append("});");
      String insertString = insert.toString();
      classTransforms.put(arg1, classTransforms.get(arg1) + insertString);
    } catch (SecurityException | IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Instantiates subclass by loading class if not already loaded and reflectively creating a new instance
   */
  public void newObject(Value[] args) throws ARTException {
    try {
      String arg1 = toInnerString(args[1]);
      String arg2 = toInnerString(args[2]);
      Class<?> cls;
      if (classes.containsKey(arg2) != true) {
        CtClass ctcls = ctclasses.get(arg2);
        CtConstructor ctconstruct = ctcls.getConstructors()[0];
        ctconstruct.insertAfter(classTransforms.get(arg2));
        ClassPool pool = ClassPool.getDefault();
        cls = pool.toClass(ctcls, ValueUserPlugin.class);
        classes.put(arg2, cls);
      } else {
        cls = classes.get(arg2);
      }
      Shape3D shape = new Sphere();
      switch (cls.getSuperclass().getName()) {
        case "javafx.scene.shape.Sphere":
          shape = (Shape3D) cls.getDeclaredConstructor(double.class).newInstance(toFloat(args[3]));
          break;
        case "javafx.scene.shape.Box":
          shape = (Shape3D) cls.getDeclaredConstructor(double.class,double.class,double.class).newInstance(toFloat(args[3])
          ,toFloat(args[4]),toFloat(args[5]));
          break;
        case "javafx.scene.shape.Cylinder":
          shape = (Shape3D) cls.getDeclaredConstructor(double.class,double.class).newInstance(toFloat(args[3])
          ,toFloat(args[4]));
          break;
        case "TrapPrism":
          Value[] fourShapeArgs = {new __string(""), args[1], args[3], args[4], args[5], args[6]};
          TriangleMesh mesh = (TriangleMesh) ValueUserPlugin.class.getMethod("draw".concat(cls.getSuperclass().getName()),
           Value[].class).invoke(this, (Object) fourShapeArgs);
          shape = (Shape3D) cls.getDeclaredConstructor(Mesh.class).newInstance(mesh);
          break;
        case "Pyramid":
        case "TriPrism":
        case "Tetra":
          Value[] threeShapeArgs = {new __string(""), args[1], args[3], args[4], args[5]};
          mesh = (TriangleMesh) ValueUserPlugin.class.getMethod("draw".concat(cls.getSuperclass().getName()),
           Value[].class).invoke(this, (Object) threeShapeArgs);
          shape = (Shape3D) cls.getDeclaredConstructor(Mesh.class).newInstance(mesh);
          break;
        case "Cone":
          Value[] twoShapeArgs = {new __string(""), args[1], args[3], args[4]};
          mesh = (TriangleMesh) ValueUserPlugin.class.getMethod("draw".concat(cls.getSuperclass().getName()),
           Value[].class).invoke(this, (Object) twoShapeArgs);
          shape = (Shape3D) cls.getDeclaredConstructor(Mesh.class).newInstance(mesh);
          break;
      }
      shapes.put(arg1, shape);
      group.getChildren().add(shape);
    } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException 
    | SecurityException | CannotCompileException e) {
      e.printStackTrace();
    }
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * Creates x number of objects from subclass by calling newObject x times
   */
  public void newObjects(Value[] args) throws ARTException {
    Value[] vals = Arrays.copyOfRange(args, 1, args.length);
    String arg2 = toInnerString(args[2]);
    for (int i = 1; i <= toInt(args[1]); i++) {
      vals[1] = new __string(arg2 + i);
      newObject(vals);
    }
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform that changes the colour of a given shape's material
   */
  public void colour(Shape3D shape, Value[] args) throws ARTException {
    PhongMaterial material = new PhongMaterial();
    material.setDiffuseColor(Color.web(toInnerString(args[2])));
    shape.setMaterial(material);
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform that translates a given shape along the vector x,y,z
   */
  public void translate(Shape3D shape, Value[] args) throws ARTException {
    shape.setTranslateX(toFloat(args[2]));
    shape.setTranslateY(-toFloat(args[3]));
    shape.setTranslateZ(toFloat(args[4]));
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * setTransform on a given set of objects
   * Translates each shape in set by start+(n-1)*step
   */
  public void translateAll(Value[] args) throws ARTException {
    String baseKey = toInnerString(args[1]);
    int i = 1;
    Shape3D shape = shapes.get(baseKey + i);
    while (shape != null) {
      shape.setTranslateX(toFloat(args[2])+(toFloat(args[3])*(i-1)));
      shape.setTranslateY(-(toFloat(args[4])+(toFloat(args[5])*(i-1))));
      shape.setTranslateZ(toFloat(args[6])+(toFloat(args[7])*(i-1)));
      i++;
      shape = shapes.get(baseKey + i);
    } 
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Rotates a given shape by angle around centre point of shape on given axis
   */
  public void rotate(Shape3D shape, Value[] args) throws ARTException {
    Rotate rotate = new Rotate(toFloat(args[2]));
    // Gets centre point of object
    rotate.setPivotX(shape.getTranslateX());
    rotate.setPivotY(shape.getTranslateY());
    rotate.setPivotZ(shape.getTranslateZ());
    switch (toInnerString(args[3])) {
      case "x":
      case "X":
        rotate.setAxis(Rotate.X_AXIS);
        break;
      case "y":
      case "Y":
        rotate.setAxis(Rotate.Y_AXIS);
        break;
      case "z":
      case "Z":
        rotate.setAxis(Rotate.Z_AXIS);
        break;
    }
    shape.getTransforms().add(rotate);
  }

  
  /** 
   * @param args
   * @throws ARTException
   * 
   * setTransform on set of shapes
   * Rotates each shape in set by start+(n-1)*step by calling rotate
   */
  public void rotateAll(Value[] args) throws ARTException {
    String baseKey = toInnerString(args[1]);
    int i = 1;
    Shape3D shape = shapes.get(baseKey + i);
    Value[] vals = {new __string(""), new __string(""), new __real64(toFloat(args[2])), new __string(toInnerString(args[4]))};
    while (shape != null) {
      rotate(shape, vals);
      vals[2] = new __real64(toFloat(vals[2])+toFloat(args[3]));
      i++;
      shape = shapes.get(baseKey + i);
    } 
  }
  
  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform to scale shape by given factor
   */
  public void scale(Shape3D shape, Value[] args) throws ARTException {
    Scale scale = new Scale(toFloat(args[2]), toFloat(args[2]), toFloat(args[2]));
    // Gets centre point of object
    scale.setPivotX(shape.getTranslateX());
    scale.setPivotY(shape.getTranslateY());
    scale.setPivotZ(shape.getTranslateZ());
    shape.getTransforms().add(scale);
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform to toggle between solid or line version of shape
   */
  public void isfilled(Shape3D shape, Value[] args) throws ARTException {
    switch (toInnerString(args[2])) {
      case "true":
      case "True":
        shape.setDrawMode(DrawMode.FILL);
        break;
      case "false":
      case "False":
        shape.setDrawMode(DrawMode.LINE);
        break;
    }
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform to set a given shape's material to the given texture
   */
  public void texture(Shape3D shape, Value[] args) throws ARTException {
    PhongMaterial material = new PhongMaterial();
    material.setDiffuseMap(new Image(toInnerString(args[2])));
    shape.setMaterial(material);
  }

  
  /** 
   * @param shape
   * @param args
   * @throws ARTException
   * 
   * Transform to set a given shape's opacity to a value between 0 and 1
   */
  public void opacity(Shape3D shape, Value[] args) throws ARTException {
    shape.setOpacity(toFloat(args[2]));
  }
}