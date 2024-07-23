Uses of Class simple.robot.utils.WorldArea   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.robot.utils.WorldArea"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/robot/utils/class-use/WorldArea.html)
*   [No Frames](WorldArea.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.robot.utils.WorldArea
--------------------------------------------

*   Packages that use [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") 
    
    Package
    
    Description
    
    [simple.hooks.interfaces](#simple.hooks.interfaces)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
    [simple.hooks.simplebot](#simple.hooks.simplebot)
    
     
    
*   *   ### Uses of [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") in [simple.hooks.interfaces](../../../../simple/hooks/interfaces/package-summary.html)
        
        Methods in [simple.hooks.interfaces](../../../../simple/hooks/interfaces/package-summary.html) with parameters of type [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") 
        
        Modifier and Type
        
        Method and Description
        
        `default boolean`
        
        SimpleLocatable.`[within](../../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        If object is inside an area
        
    *   ### Uses of [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Methods in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) with parameters of type [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will filter out all items who are not inside of the specified area
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will filter out all items who are not inside of the specified area
        
    *   ### Uses of [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html)
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) that return [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") 
        
        Modifier and Type
        
        Method and Description
        
        `[WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")`
        
        Pathing.`[createArea](../../../../simple/hooks/simplebot/Pathing.html#createArea-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Returns a new worldarea created from an array of points in a polygonal style
        
        `[WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")`
        
        Pathing.`[createArea](../../../../simple/hooks/simplebot/Pathing.html#createArea-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point1, net.runelite.api.coords.WorldPoint point2)`
        
        Returns a new worldarea created from 2 points in a rectangular style
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) with parameters of type [WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        Pathing.`[inArea](../../../../simple/hooks/simplebot/Pathing.html#inArea-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will return {true} if the local player is inside of {area}, false otherwise
        
        `boolean`
        
        Pathing.`[inArea](../../../../simple/hooks/simplebot/Pathing.html#inArea-simple.robot.utils.WorldArea-net.runelite.api.coords.WorldPoint-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area, net.runelite.api.coords.WorldPoint point)`
        
        Will return {true} if the {point} is inside of {area}, false otherwise
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/robot/utils/class-use/WorldArea.html)
*   [No Frames](WorldArea.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->