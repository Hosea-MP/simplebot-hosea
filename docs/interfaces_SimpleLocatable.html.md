SimpleLocatable   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleLocatable"; } } catch(err) { } //--> var methods = {"i0":18,"i1":18,"i2":6,"i3":18,"i4":18}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\],16:\["t5","Default Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleLocatable.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleInteractable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleLocatable.html)
*   [No Frames](SimpleLocatable.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)

simple.hooks.interfaces

Interface SimpleLocatable
-------------------------

*   All Known Subinterfaces:
    
    [SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces"), [SimpleInteractable](../../../simple/hooks/interfaces/SimpleInteractable.html "interface in simple.hooks.interfaces")
    
    All Known Implementing Classes:
    
    [SimpleGroundItem](../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers"), [SimpleLocalPlayer](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers"), [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers"), [SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers"), [SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")
    
    * * *
    
      
    
    public interface SimpleLocatable
    
    Created by Seth on Nov 4, 2019 at 6:40:44 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) [Default Methods](javascript:show\(16\);) 
        
        Modifier and Type
        
        Method and Description
        
        `default void`
        
        `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--)()` 
        
        `default int`
        
        `[distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to)`
        
        Distance to object {to}
        
        `net.runelite.api.coords.WorldPoint`
        
        `[getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)()`
        
        Position in world of object
        
        `default boolean`
        
        `[within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-)([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        If object is inside an area
        
        `default boolean`
        
        `[withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to, int range)`
        
        If object is within {range} of {to}
        

*   *   ### Method Detail
        
        *   #### getLocation
            
            net.runelite.api.coords.WorldPoint getLocation()
            
            Position in world of object
            
            Returns:
            
            \- Worldpoint of the locatable wrapper
            
        
        *   #### within
            
            default boolean within([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)
            
            If object is inside an area
            
            Parameters:
            
            `area` - - area to check
            
            Returns:
            
            \- {true} inside {false} outside
            
        
        *   #### withinRange
            
            default boolean withinRange([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to,
                                        int range)
            
            If object is within {range} of {to}
            
            Parameters:
            
            `to` - - object to check
            
            `range` - - range to check within
            
            Returns:
            
            \- {true} within range {false} outside range
            
        
        *   #### distanceTo
            
            default int distanceTo([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to)
            
            Distance to object {to}
            
            Parameters:
            
            `to` - - object to check against
            
            Returns:
            
            \- 2D distance to {to} tileafte
            
        
        *   #### clickOnMinimap
            
            default void clickOnMinimap()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleLocatable.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleInteractable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleLocatable.html)
*   [No Frames](SimpleLocatable.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)