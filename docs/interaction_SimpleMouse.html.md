SimpleMouse   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleMouse"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10,"i17":10,"i18":10,"i19":10,"i20":10,"i21":10,"i22":10,"i23":10,"i24":10,"i25":10,"i26":10,"i27":10,"i28":10,"i29":10,"i30":10,"i31":10,"i32":10,"i33":10,"i34":10,"i35":10,"i36":10,"i37":10,"i38":10,"i39":10,"i40":10,"i41":10,"i42":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleMouse.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   Next Class

*   [Frames](../../../index.html?simple/hooks/interaction/SimpleMouse.html)
*   [No Frames](SimpleMouse.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.interaction

Class SimpleMouse
-----------------

*   java.lang.Object
*   *   simple.hooks.interaction.SimpleMouse

*   All Implemented Interfaces:
    
    java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.util.EventListener
    
    * * *
    
      
    
    public class SimpleMouse
    extends java.lang.Object
    implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static int[][][]`
        
        `[MOUSE_Y_POS](../../../simple/hooks/interaction/SimpleMouse.html#MOUSE_Y_POS)` 
        
        `static net.runelite.api.Point`
        
        `[NIL_POINT](../../../simple/hooks/interaction/SimpleMouse.html#NIL_POINT)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleMouse](../../../simple/hooks/interaction/SimpleMouse.html#SimpleMouse-simple.robot.api.ClientContext-net.runelite.api.Client-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx, net.runelite.api.Client client)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[blockingInput](../../../simple/hooks/interaction/SimpleMouse.html#blockingInput--)()` 
        
        `boolean`
        
        `[blockInput](../../../simple/hooks/interaction/SimpleMouse.html#blockInput-boolean-)(boolean block)` 
        
        `boolean`
        
        `[clearMenu](../../../simple/hooks/interaction/SimpleMouse.html#clearMenu--)()` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-boolean-)(boolean left)` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-int-int-)(int x, int y)`
        
        Static user interaction methods click(x, y) click(point) click(point, left)
        
        `boolean`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-int-int-boolean-)(int x, int y, boolean left)` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-net.runelite.api.Point-)(net.runelite.api.Point p)` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-java.awt.Point-)(java.awt.Point pos)` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-net.runelite.api.Point-boolean-)(net.runelite.api.Point p, boolean left)` 
        
        `void`
        
        `[click](../../../simple/hooks/interaction/SimpleMouse.html#click-java.awt.Point-boolean-)(java.awt.Point pos, boolean leftClick)` 
        
        `boolean`
        
        `[clickAndHold](../../../simple/hooks/interaction/SimpleMouse.html#clickAndHold-int-int-boolean-java.util.function.BooleanSupplier-int-int-)(int x, int y, boolean left, java.util.function.BooleanSupplier condition, int timeout, int tries)` 
        
        `boolean`
        
        `[clickAndHold](../../../simple/hooks/interaction/SimpleMouse.html#clickAndHold-int-int-boolean-int-)(int x, int y, boolean left, int hold)` 
        
        `java.lang.String`
        
        `[clickFirstExactOption](../../../simple/hooks/interaction/SimpleMouse.html#clickFirstExactOption-simple.hooks.wrappers.Clickable-java.lang.String-java.lang.String...-)([Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers") clickable, java.lang.String objectName, java.lang.String... actionNames)` 
        
        `java.lang.String`
        
        `[clickFirstExactOption](../../../simple/hooks/interaction/SimpleMouse.html#clickFirstExactOption-net.runelite.api.Point-java.lang.String-java.lang.String...-)(net.runelite.api.Point point, java.lang.String objectName, java.lang.String... actionNames)` 
        
        `java.lang.String`
        
        `[clickFirstOption](../../../simple/hooks/interaction/SimpleMouse.html#clickFirstOption-simple.hooks.wrappers.Clickable-java.lang.String-java.lang.String...-)([Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers") clickable, java.lang.String objectName, java.lang.String... actionNames)` 
        
        `java.lang.String`
        
        `[clickFirstOption](../../../simple/hooks/interaction/SimpleMouse.html#clickFirstOption-net.runelite.api.Point-java.lang.String-java.lang.String...-)(net.runelite.api.Point point, java.lang.String objectName, java.lang.String... actionNames)` 
        
        `boolean`
        
        `[clickPointWithOption](../../../simple/hooks/interaction/SimpleMouse.html#clickPointWithOption-net.runelite.api.Point-int-)(net.runelite.api.Point p, int option)` 
        
        `boolean`
        
        `[clickPointWithOption](../../../simple/hooks/interaction/SimpleMouse.html#clickPointWithOption-net.runelite.api.Point-int-boolean-)(net.runelite.api.Point point, int option, boolean forceMenu)` 
        
        `boolean`
        
        `[clickPointWithOption](../../../simple/hooks/interaction/SimpleMouse.html#clickPointWithOption-net.runelite.api.Point-java.lang.String-java.lang.String-)(net.runelite.api.Point point, java.lang.String target, java.lang.String actionName)` 
        
        `boolean`
        
        `[clickPointWithOption](../../../simple/hooks/interaction/SimpleMouse.html#clickPointWithOption-net.runelite.api.Point-java.lang.String-java.lang.String-int-)(net.runelite.api.Point point, java.lang.String target, java.lang.String actionName, int identifier)` 
        
        `boolean`
        
        `[clickPointWithOption](../../../simple/hooks/interaction/SimpleMouse.html#clickPointWithOption-java.lang.String-java.lang.String-)(java.lang.String target, java.lang.String action)` 
        
        `void`
        
        `[drag](../../../simple/hooks/interaction/SimpleMouse.html#drag-java.awt.Point-int-)(java.awt.Point p, int button)` 
        
        `java.applet.Applet`
        
        `[getApplet](../../../simple/hooks/interaction/SimpleMouse.html#getApplet--)()` 
        
        `net.runelite.api.Point`
        
        `[getBotPos](../../../simple/hooks/interaction/SimpleMouse.html#getBotPos--)()` 
        
        `java.awt.Point`
        
        `[getBotPosAwt](../../../simple/hooks/interaction/SimpleMouse.html#getBotPosAwt--)()` 
        
        `java.awt.Component`
        
        `[getComponent](../../../simple/hooks/interaction/SimpleMouse.html#getComponent--)()` 
        
        `net.runelite.api.Point`
        
        `[getLocation](../../../simple/hooks/interaction/SimpleMouse.html#getLocation--)()` 
        
        `java.awt.Point`
        
        `[getPoint](../../../simple/hooks/interaction/SimpleMouse.html#getPoint--)()` 
        
        `double`
        
        `[getStartYPosForMenu](../../../simple/hooks/interaction/SimpleMouse.html#getStartYPosForMenu-int-int-)(int menuOptionCount, int mouseY)` 
        
        `void`
        
        `[mouseClicked](../../../simple/hooks/interaction/SimpleMouse.html#mouseClicked-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mouseDragged](../../../simple/hooks/interaction/SimpleMouse.html#mouseDragged-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mouseEntered](../../../simple/hooks/interaction/SimpleMouse.html#mouseEntered-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mouseExited](../../../simple/hooks/interaction/SimpleMouse.html#mouseExited-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mouseMoved](../../../simple/hooks/interaction/SimpleMouse.html#mouseMoved-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mousePressed](../../../simple/hooks/interaction/SimpleMouse.html#mousePressed-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[mouseReleased](../../../simple/hooks/interaction/SimpleMouse.html#mouseReleased-java.awt.event.MouseEvent-)(java.awt.event.MouseEvent e)` 
        
        `void`
        
        `[moveMouse](../../../simple/hooks/interaction/SimpleMouse.html#moveMouse-int-int-)(int x, int y)` 
        
        `void`
        
        `[moveMouse](../../../simple/hooks/interaction/SimpleMouse.html#moveMouse-java.awt.Point-)(java.awt.Point point)` 
        
        `void`
        
        `[moveMouse](../../../simple/hooks/interaction/SimpleMouse.html#moveMouse-net.runelite.api.Point-)(net.runelite.api.Point point)` 
        
        `void`
        
        `[pressMouse](../../../simple/hooks/interaction/SimpleMouse.html#pressMouse-boolean-)(boolean left)` 
        
        `void`
        
        `[releaseMouse](../../../simple/hooks/interaction/SimpleMouse.html#releaseMouse-boolean-)(boolean left)` 
        
        `void`
        
        `[releaseMouse](../../../simple/hooks/interaction/SimpleMouse.html#releaseMouse-int-int-)(int posX, int posY)` 
        
        `void`
        
        `[setSpeed](../../../simple/hooks/interaction/SimpleMouse.html#setSpeed-int-)(int speed)` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### MOUSE\_Y\_POS
            
            public static final int\[\]\[\]\[\] MOUSE\_Y\_POS
            
        
        *   #### NIL\_POINT
            
            public static net.runelite.api.Point NIL\_POINT
            
    
    *   ### Constructor Detail
        
        *   #### SimpleMouse
            
            public SimpleMouse([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx,
                               net.runelite.api.Client client)
            
    
    *   ### Method Detail
        
        *   #### setSpeed
            
            public void setSpeed(int speed)
            
        
        *   #### click
            
            public void click(int x,
                              int y)
            
            Static user interaction methods click(x, y) click(point) click(point, left)
            
        
        *   #### click
            
            public void click(boolean left)
            
        
        *   #### click
            
            public void click(net.runelite.api.Point p)
            
        
        *   #### click
            
            public void click(net.runelite.api.Point p,
                              boolean left)
            
        
        *   #### getComponent
            
            public java.awt.Component getComponent()
            
        
        *   #### clickPointWithOption
            
            public boolean clickPointWithOption(java.lang.String target,
                                                java.lang.String action)
            
        
        *   #### clickPointWithOption
            
            public boolean clickPointWithOption(net.runelite.api.Point point,
                                                java.lang.String target,
                                                java.lang.String actionName)
            
        
        *   #### clickPointWithOption
            
            public boolean clickPointWithOption(net.runelite.api.Point point,
                                                java.lang.String target,
                                                java.lang.String actionName,
                                                int identifier)
            
        
        *   #### getStartYPosForMenu
            
            public double getStartYPosForMenu(int menuOptionCount,
                                              int mouseY)
            
        
        *   #### clickFirstOption
            
            public java.lang.String clickFirstOption([Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers") clickable,
                                                     java.lang.String objectName,
                                                     java.lang.String... actionNames)
            
        
        *   #### clickFirstExactOption
            
            public java.lang.String clickFirstExactOption([Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers") clickable,
                                                          java.lang.String objectName,
                                                          java.lang.String... actionNames)
            
        
        *   #### clickFirstOption
            
            public java.lang.String clickFirstOption(net.runelite.api.Point point,
                                                     java.lang.String objectName,
                                                     java.lang.String... actionNames)
            
        
        *   #### clickFirstExactOption
            
            public java.lang.String clickFirstExactOption(net.runelite.api.Point point,
                                                          java.lang.String objectName,
                                                          java.lang.String... actionNames)
            
        
        *   #### clickPointWithOption
            
            public boolean clickPointWithOption(net.runelite.api.Point p,
                                                int option)
                                         throws java.lang.IllegalAccessException,
                                                java.lang.IllegalArgumentException,
                                                java.lang.reflect.InvocationTargetException,
                                                java.lang.NoSuchMethodException,
                                                java.lang.SecurityException
            
            Throws:
            
            `java.lang.IllegalAccessException`
            
            `java.lang.IllegalArgumentException`
            
            `java.lang.reflect.InvocationTargetException`
            
            `java.lang.NoSuchMethodException`
            
            `java.lang.SecurityException`
            
        
        *   #### clickPointWithOption
            
            public boolean clickPointWithOption(net.runelite.api.Point point,
                                                int option,
                                                boolean forceMenu)
                                         throws java.lang.IllegalAccessException,
                                                java.lang.IllegalArgumentException,
                                                java.lang.reflect.InvocationTargetException,
                                                java.lang.NoSuchMethodException,
                                                java.lang.SecurityException
            
            Throws:
            
            `java.lang.IllegalAccessException`
            
            `java.lang.IllegalArgumentException`
            
            `java.lang.reflect.InvocationTargetException`
            
            `java.lang.NoSuchMethodException`
            
            `java.lang.SecurityException`
            
        
        *   #### click
            
            public boolean click(int x,
                                 int y,
                                 boolean left)
            
        
        *   #### clickAndHold
            
            public boolean clickAndHold(int x,
                                        int y,
                                        boolean left,
                                        int hold)
            
        
        *   #### clickAndHold
            
            public boolean clickAndHold(int x,
                                        int y,
                                        boolean left,
                                        java.util.function.BooleanSupplier condition,
                                        int timeout,
                                        int tries)
            
        
        *   #### pressMouse
            
            public void pressMouse(boolean left)
            
        
        *   #### releaseMouse
            
            public void releaseMouse(int posX,
                                     int posY)
            
        
        *   #### releaseMouse
            
            public void releaseMouse(boolean left)
            
        
        *   #### clearMenu
            
            public boolean clearMenu()
            
        
        *   #### moveMouse
            
            public void moveMouse(java.awt.Point point)
            
        
        *   #### moveMouse
            
            public void moveMouse(net.runelite.api.Point point)
            
        
        *   #### moveMouse
            
            public void moveMouse(int x,
                                  int y)
            
        
        *   #### click
            
            public void click(java.awt.Point pos,
                              boolean leftClick)
            
        
        *   #### click
            
            public void click(java.awt.Point pos)
            
        
        *   #### drag
            
            public void drag(java.awt.Point p,
                             int button)
            
        
        *   #### getBotPosAwt
            
            public java.awt.Point getBotPosAwt()
            
        
        *   #### getBotPos
            
            public net.runelite.api.Point getBotPos()
            
        
        *   #### getPoint
            
            public java.awt.Point getPoint()
            
        
        *   #### blockingInput
            
            public boolean blockingInput()
            
        
        *   #### blockInput
            
            public boolean blockInput(boolean block)
            
        
        *   #### mouseMoved
            
            public void mouseMoved(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseMoved` in interface `java.awt.event.MouseMotionListener`
            
        
        *   #### mouseDragged
            
            public void mouseDragged(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseDragged` in interface `java.awt.event.MouseMotionListener`
            
        
        *   #### mouseClicked
            
            public void mouseClicked(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseClicked` in interface `java.awt.event.MouseListener`
            
        
        *   #### mouseEntered
            
            public void mouseEntered(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseEntered` in interface `java.awt.event.MouseListener`
            
        
        *   #### mouseExited
            
            public void mouseExited(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseExited` in interface `java.awt.event.MouseListener`
            
        
        *   #### mousePressed
            
            public void mousePressed(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mousePressed` in interface `java.awt.event.MouseListener`
            
        
        *   #### mouseReleased
            
            public void mouseReleased(java.awt.event.MouseEvent e)
            
            Specified by:
            
            `mouseReleased` in interface `java.awt.event.MouseListener`
            
        
        *   #### getApplet
            
            public java.applet.Applet getApplet()
            
        
        *   #### getLocation
            
            public net.runelite.api.Point getLocation()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleMouse.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   Next Class

*   [Frames](../../../index.html?simple/hooks/interaction/SimpleMouse.html)
*   [No Frames](SimpleMouse.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)