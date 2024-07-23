Viewport   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Viewport"; } } catch(err) { } //--> var methods = {"i0":10,"i1":42,"i2":42,"i3":42,"i4":42,"i5":42,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Viewport.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Varpbits.html "class in simple.hooks.simplebot")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/simplebot/Viewport.html)
*   [No Frames](Viewport.html)

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

simple.hooks.simplebot

Class Viewport
--------------

*   java.lang.Object
*   *   simple.hooks.simplebot.Viewport

*   * * *
    
      
    
    public class Viewport
    extends java.lang.Object
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static int`
        
        `[EAST](../../../simple/hooks/simplebot/Viewport.html#EAST)`
        
        Deprecated. 
        
        `static int`
        
        `[NORTH](../../../simple/hooks/simplebot/Viewport.html#NORTH)`
        
        Deprecated. 
        
        `static int`
        
        `[NORTH_EAST](../../../simple/hooks/simplebot/Viewport.html#NORTH_EAST)`
        
        Deprecated. 
        
        `static int`
        
        `[NORTH_WEST](../../../simple/hooks/simplebot/Viewport.html#NORTH_WEST)`
        
        Deprecated. 
        
        `static int`
        
        `[SOUTH](../../../simple/hooks/simplebot/Viewport.html#SOUTH)`
        
        Deprecated. 
        
        `static int`
        
        `[SOUTH_EAST](../../../simple/hooks/simplebot/Viewport.html#SOUTH_EAST)`
        
        Deprecated. 
        
        `static int`
        
        `[SOUTH_WEST](../../../simple/hooks/simplebot/Viewport.html#SOUTH_WEST)`
        
        Deprecated. 
        
        `static int`
        
        `[WEST](../../../simple/hooks/simplebot/Viewport.html#WEST)`
        
        Deprecated. 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Viewport](../../../simple/hooks/simplebot/Viewport.html#Viewport-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[angle](../../../simple/hooks/simplebot/Viewport.html#angle-int-)(int degrees)`
        
        Will angle/turn the camera to the specified degree, this will change the yaw of the camera
        
        `boolean`
        
        `[entityIsVisible](../../../simple/hooks/simplebot/Viewport.html#entityIsVisible-net.runelite.api.Actor-)(net.runelite.api.Actor entity)`
        
        Deprecated. 
        
        `void`
        
        `[faceCamera](../../../simple/hooks/simplebot/Viewport.html#faceCamera-int-boolean-)(int direction, boolean tiltUp)`
        
        Deprecated. 
        
        `void`
        
        `[faceEntity](../../../simple/hooks/simplebot/Viewport.html#faceEntity-net.runelite.api.Actor-)(net.runelite.api.Actor entity)`
        
        Deprecated. 
        
        `void`
        
        `[faceEntity](../../../simple/hooks/simplebot/Viewport.html#faceEntity-net.runelite.api.GameObject-)(net.runelite.api.GameObject entity)`
        
        Deprecated. 
        
        `void`
        
        `[faceEntity](../../../simple/hooks/simplebot/Viewport.html#faceEntity-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        Deprecated. 
        
        `int`
        
        `[pitch](../../../simple/hooks/simplebot/Viewport.html#pitch--)()`
        
        Will return the pitch of the camera
        
        `boolean`
        
        `[pitch](../../../simple/hooks/simplebot/Viewport.html#pitch-boolean-)(boolean up)`
        
        Will tilt the camera either completely up or down
        
        `boolean`
        
        `[pitch](../../../simple/hooks/simplebot/Viewport.html#pitch-int-)(int percent)`
        
        Will tilt the camera to specified pitch percentage out of 100
        
        `boolean`
        
        `[turnTo](../../../simple/hooks/simplebot/Viewport.html#turnTo-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)` 
        
        `int`
        
        `[x](../../../simple/hooks/simplebot/Viewport.html#x--)()`
        
        Will return the x-position of the camera
        
        `int`
        
        `[y](../../../simple/hooks/simplebot/Viewport.html#y--)()`
        
        Will return the y-position of the camera
        
        `int`
        
        `[yaw](../../../simple/hooks/simplebot/Viewport.html#yaw--)()`
        
        Will return the yaw of the camera
        
        `int`
        
        `[z](../../../simple/hooks/simplebot/Viewport.html#z--)()`
        
        Will return the z-position of the camera
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### NORTH
            
            @Deprecated
            public static final int NORTH
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.NORTH)
            
        
        *   #### SOUTH
            
            @Deprecated
            public static final int SOUTH
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.SOUTH)
            
        
        *   #### WEST
            
            @Deprecated
            public static final int WEST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.WEST)
            
        
        *   #### EAST
            
            @Deprecated
            public static final int EAST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.EAST)
            
        
        *   #### NORTH\_EAST
            
            @Deprecated
            public static final int NORTH\_EAST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.NORTH_EAST)
            
        
        *   #### NORTH\_WEST
            
            @Deprecated
            public static final int NORTH\_WEST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.NORTH_WEST)
            
        
        *   #### SOUTH\_EAST
            
            @Deprecated
            public static final int SOUTH\_EAST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.SOUTH_EAST)
            
        
        *   #### SOUTH\_WEST
            
            @Deprecated
            public static final int SOUTH\_WEST
            
            Deprecated. 
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Viewport.SOUTH_WEST)
            
    
    *   ### Constructor Detail
        
        *   #### Viewport
            
            public Viewport([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### faceEntity
            
            @Deprecated
            public void faceEntity(net.runelite.api.GameObject entity)
            
            Deprecated. 
            
        
        *   #### faceEntity
            
            @Deprecated
            public void faceEntity(net.runelite.api.Actor entity)
            
            Deprecated. 
            
        
        *   #### faceEntity
            
            @Deprecated
            public void faceEntity(net.runelite.api.coords.WorldPoint point)
            
            Deprecated. 
            
        
        *   #### entityIsVisible
            
            @Deprecated
            public boolean entityIsVisible(net.runelite.api.Actor entity)
            
            Deprecated. 
            
        
        *   #### faceCamera
            
            @Deprecated
            public void faceCamera(int direction,
                                                boolean tiltUp)
            
            Deprecated. 
            
        
        *   #### x
            
            public int x()
            
            Will return the x-position of the camera
            
            Returns:
            
        
        *   #### y
            
            public int y()
            
            Will return the y-position of the camera
            
            Returns:
            
        
        *   #### z
            
            public int z()
            
            Will return the z-position of the camera
            
            Returns:
            
        
        *   #### yaw
            
            public int yaw()
            
            Will return the yaw of the camera
            
            Returns:
            
        
        *   #### pitch
            
            public int pitch()
            
            Will return the pitch of the camera
            
            Returns:
            
        
        *   #### pitch
            
            public boolean pitch(boolean up)
            
            Will tilt the camera either completely up or down
            
            Parameters:
            
            `up` - {true} for up and {false} for down
            
            Returns:
            
        
        *   #### pitch
            
            public boolean pitch(int percent)
            
            Will tilt the camera to specified pitch percentage out of 100
            
            Parameters:
            
            `percent` - values from 0-100
            
            Returns:
            
        
        *   #### angle
            
            public boolean angle(int degrees)
            
            Will angle/turn the camera to the specified degree, this will change the yaw of the camera
            
            Parameters:
            
            `degrees` - values from 0-360
            
            Returns:
            
        
        *   #### turnTo
            
            public boolean turnTo([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Viewport.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Varpbits.html "class in simple.hooks.simplebot")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/simplebot/Viewport.html)
*   [No Frames](Viewport.html)

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