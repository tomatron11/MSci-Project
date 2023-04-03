import static org.junit.Assert.*;
import org.junit.Test;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.Value;
import uk.ac.rhul.cs.csle.art.value.__int32;
import uk.ac.rhul.cs.csle.art.value.__real64;
import uk.ac.rhul.cs.csle.art.value.__string;

/**
 * Test class for ValueUserPlugin, testing UKCAD language functionality
 * Uses JUnit test library
 * Each test must contain creation of new JavaFx application thread to perform operations on
 */
public class TestValueUserPlugin {

    ValueUserPlugin plugin;

    /** 
     * @throws InterruptedException
     * @throws NotFoundException
     * @throws CannotCompileException
     * 
     * Tests creation of subclass
     */
    @Test
    public void testSubClass() throws InterruptedException, NotFoundException, CannotCompileException {
        Value[] args = {new __string("subClass"), new __string("redSphere"), new __string("Sphere"), new __string("Colour"), new __string("Red")};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(2000);
        assertTrue(plugin.ctclasses.containsKey("redSphere"));
        ClassPool pool = ClassPool.getDefault();
        assertEquals(pool.get(Sphere.class.getName()), plugin.ctclasses.get("redSphere").getSuperclass());
        assertTrue(plugin.classTransforms.containsKey("redSphere"));
        assertFalse(plugin.classes.containsKey("redSphere"));
    }

    
    /** 
     * @throws InterruptedException
     * @throws NotFoundException
     * @throws CannotCompileException
     * 
     * Tests creation of subclass with no arguments and adding a transform later
     */
    @Test
    public void testSubClassAddTransform() throws InterruptedException, NotFoundException, CannotCompileException {
        Value[] args = {new __string("subClass"), new __string("transBox"), new __string("Cuboid")};
        Value[] args2 = {new __string("addTransform"), new __string("transBox"), new __string("Translate"), new __real64(100.0)
        , new __real64(100.0), new __real64(100.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.addTransform(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(2000);
        assertTrue(plugin.ctclasses.containsKey("transBox"));
        ClassPool pool = ClassPool.getDefault();
        assertEquals(pool.get(Box.class.getName()), plugin.ctclasses.get("transBox").getSuperclass());
        assertTrue(plugin.classTransforms.containsKey("transBox"));
        assertFalse(plugin.classes.containsKey("redSphere"));
    }

    
    /** 
     * @throws InterruptedException
     * 
     * Tests instantiation of object from subclass
     */
    @Test
    public void testObject() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("redSphere"), new __string("Sphere"), new __string("Colour"), new __string("Red")};
        Value[] args2 = {new __string("object"), new __string("rs"), new __string("redSphere"), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(2000);
        assertTrue(plugin.classes.containsKey("redSphere"));
        assertTrue(plugin.shapes.containsKey("rs"));
        assertEquals(Sphere.class, plugin.classes.get("redSphere").getSuperclass());
        assertEquals(Sphere.class, plugin.shapes.get("rs").getClass().getSuperclass());
        assertEquals(plugin.classes.get("redSphere"), plugin.shapes.get("rs").getClass());
    }

    
    /** 
     * @throws ARTException
     * @throws InterruptedException
     * 
     * Tests creation of subclass and object from class that takes mesh as an argument
     */
    @Test
    public void testMeshObject() throws ARTException, InterruptedException {
        Value[] args = {new __string("subClass"), new __string("pyra"), new __string("Pyramid")};
        Value[] args2 = {new __string("object"), new __string("p"), new __string("pyra"), new __real64(50.0), new __real64(50.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.classes.containsKey("pyra"));
        assertTrue(plugin.shapes.containsKey("p"));
        assertEquals(MeshView.class, plugin.classes.get("pyra").getSuperclass().getSuperclass());
        assertEquals(MeshView.class, plugin.shapes.get("p").getClass().getSuperclass().getSuperclass());
        assertEquals(plugin.classes.get("pyra"), plugin.shapes.get("p").getClass());
    }

    
    /** 
     * @throws InterruptedException
     * 
     * Tests instantiation of many objects from a subclass
     */
    @Test
    public void testObjects() throws InterruptedException { 
        Value[] args = {new __string("subClass"), new __string("nonFilledBox"), new __string("Cuboid"), new __string("IsFilled"), new __string("false")};
        Value[] args2 = {new __string("objects"), new __int32(5,0), new __string("nfb"), new __string("nonFilledBox"), new __real64(50.0), new __real64(50.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObjects(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.classes.containsKey("nonFilledBox"));
        assertEquals(Box.class, plugin.classes.get("nonFilledBox").getSuperclass());
        for (int i = 1; i <= 5; i++) {
            assertTrue(plugin.shapes.containsKey("nfb"+i));
            assertEquals(plugin.classes.get("nonFilledBox"), plugin.shapes.get("nfb"+i).getClass());
        }
    }

    
    /** 
     * @throws InterruptedException
     * 
     * Tests translating of a set of objects
     */
    @Test
    public void testTranslateAll() throws InterruptedException { 
        Value[] args = {new __string("subClass"), new __string("rotatedCylinder"), new __string("Cylinder"), new __string("Rotate"), new __real64(90.0), new __string("X")};
        Value[] args2 = {new __string("objects"), new __int32(3,0), new __string("rc"), new __string("rotatedCylinder"), new __real64(50.0), new __real64(50.0)};
        Value[] args3 = {new __string("translateAll"), new __string("rc"), new __real64(0.0), new __real64(50.0), new __real64(0.0), new __real64(50.0), new __real64(0.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObjects(args2);
                            plugin.translateAll(args3);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.classes.containsKey("rotatedCylinder"));
        assertEquals(Cylinder.class, plugin.classes.get("rotatedCylinder").getSuperclass());
        for (int i = 1; i <= 3; i++) {
            assertTrue(plugin.shapes.containsKey("rc"+i));
            assertEquals(plugin.classes.get("rotatedCylinder"), plugin.shapes.get("rc"+i).getClass());
            assertEquals((long) 50*(i-1), (long) plugin.shapes.get("rc"+i).getTranslateX());
            assertEquals((long) -50*(i-1), (long) plugin.shapes.get("rc"+i).getTranslateY());
            assertEquals((long) 50*(i-1), (long) plugin.shapes.get("rc"+i).getTranslateZ());
        }
    }

    
    /** 
     * @throws InterruptedException
     * 
     * Tests creation of subclass and object using triprism as a superclass
     */
    @Test
    public void testTriPrism() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("triprismcls"), new __string("TriPrism")};
        Value[] args2 = {new __string("object"), new __string("tp"), new __string("triprismcls"), new __real64(50.0), new __real64(50.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.ctclasses.containsKey("triprismcls"));
        assertTrue(plugin.classes.containsKey("triprismcls"));
        assertTrue(plugin.shapes.containsKey("tp"));
        assertEquals(MeshView.class, plugin.classes.get("triprismcls").getSuperclass().getSuperclass());
        assertEquals(plugin.classes.get("triprismcls"), plugin.shapes.get("tp").getClass());
    }

    /** 
     * @throws InterruptedException
     * 
     * Tests creation of subclass and object using cone as a superclass
     */
    @Test
    public void testCone() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("conecls"), new __string("Cone")};
        Value[] args2 = {new __string("object"), new __string("cone1"), new __string("conecls"), new __real64(50.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.ctclasses.containsKey("conecls"));
        assertTrue(plugin.classes.containsKey("conecls"));
        assertTrue(plugin.shapes.containsKey("cone1"));
        assertEquals(MeshView.class, plugin.classes.get("conecls").getSuperclass().getSuperclass());
        assertEquals(plugin.classes.get("conecls"), plugin.shapes.get("cone1").getClass());
    }

    /** 
     * @throws InterruptedException
     * 
     * Tests creation of subclass and object using tetra as a superclass
     */
    @Test
    public void testTetra() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("tetracls"), new __string("Tetra")};
        Value[] args2 = {new __string("object"), new __string("tetra1"), new __string("tetracls"), new __real64(50.0), new __real64(50.0), new __real64(50.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.ctclasses.containsKey("tetracls"));
        assertTrue(plugin.classes.containsKey("tetracls"));
        assertTrue(plugin.shapes.containsKey("tetra1"));
        assertEquals(MeshView.class, plugin.classes.get("tetracls").getSuperclass().getSuperclass());
        assertEquals(plugin.classes.get("tetracls"), plugin.shapes.get("tetra1").getClass());
    }

    /** 
     * @throws InterruptedException
     * 
     * Tests creation of subclass and object using trapprism as a superclass
     */
    @Test
    public void testTrapPrism() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("trapcls"), new __string("TrapPrism")};
        Value[] args2 = {new __string("object"), new __string("trap1"), new __string("trapcls"), new __real64(50.0), new __real64(100.0), new __real64(100.0), new __real64(100.0)};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObject(args2);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.ctclasses.containsKey("trapcls"));
        assertTrue(plugin.classes.containsKey("trapcls"));
        assertTrue(plugin.shapes.containsKey("trap1"));
        assertEquals(MeshView.class, plugin.classes.get("trapcls").getSuperclass().getSuperclass());
        assertEquals(plugin.classes.get("trapcls"), plugin.shapes.get("trap1").getClass());
    }

    /** 
     * @throws InterruptedException
     * 
     * Tests rotating a set of objects
     */
    @Test
    public void testRotateAll() throws InterruptedException {
        Value[] args = {new __string("subClass"), new __string("redBox"), new __string("Cuboid"), new __string("Colour"), new __string("Red")};
        Value[] args2 = {new __string("objects"), new __int32(4,0), new __string("rb"), new __string("redBox"), new __real64(50.0), new __real64(50.0), new __real64(50.0)};
        Value[] args3 = {new __string("rotateAll"), new __string("rb"), new __real64(0.0), new __real64(45.0), new __string("Z")};
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                new JFXPanel();
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        plugin = new ValueUserPlugin();
                        try {
                            plugin.subClass(args);
                            plugin.newObjects(args2);
                            plugin.rotateAll(args3);
                        } catch (ARTException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();
        Thread.sleep(3000);
        assertTrue(plugin.classes.containsKey("redBox"));
        assertEquals(Box.class, plugin.classes.get("redBox").getSuperclass());
        for (int i = 1; i <= 4; i++) {
            assertTrue(plugin.shapes.containsKey("rb"+i));
            assertEquals(plugin.classes.get("redBox"), plugin.shapes.get("rb"+i).getClass());
            assertEquals(Rotate.Z_AXIS, plugin.shapes.get("rb"+i).getRotationAxis());
            double xx = plugin.shapes.get("rb"+i).getLocalToSceneTransform().getMxx();
            double xy = plugin.shapes.get("rb"+i).getLocalToSceneTransform().getMxy();
            double angle = Math.atan2(-xy, xx);
            angle = Math.toDegrees(angle);
            angle = angle < 0 ? angle + 360 : angle; // Gets relative rotation
            assertEquals((long)45*(i-1), (long)angle);
        }
    }
}
