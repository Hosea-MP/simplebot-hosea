WorldArea   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="WorldArea"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/WorldArea.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/SimplePair.html "class in simple.robot.utils")
*   Next Class

*   [Frames](../../../index.html?simple/robot/utils/WorldArea.html)
*   [No Frames](WorldArea.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.robot.utils

Class WorldArea
---------------

*   java.lang.Object
*   *   simple.robot.utils.WorldArea

*   * * *
    
      
    
    public class WorldArea
    extends java.lang.Object
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[WorldArea](../../../simple/robot/utils/WorldArea.html#WorldArea-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Creates a 2-D polygonal area
        
        `[WorldArea](../../../simple/robot/utils/WorldArea.html#WorldArea-net.runelite.api.coords.WorldPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point1, net.runelite.api.coords.WorldPoint point2)`
        
        Creates a 2-D rectangular area
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[containsPoint](../../../simple/robot/utils/WorldArea.html#containsPoint-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)` 
        
        `net.runelite.api.coords.WorldPoint[]`
        
        `[getWorldPoints](../../../simple/robot/utils/WorldArea.html#getWorldPoints--)()` 
        
        `net.runelite.api.coords.WorldPoint`
        
        `[randomTile](../../../simple/robot/utils/WorldArea.html#randomTile--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### WorldArea
            
            public WorldArea(net.runelite.api.coords.WorldPoint point1,
                             net.runelite.api.coords.WorldPoint point2)
            
            Creates a 2-D rectangular area
            
            Parameters:
            
            `point1` - - Corner 1 of 2-D rectangle
            
            `point2` - - Corner 2 of 2-D rectangle
            
        
        *   #### WorldArea
            
            public WorldArea(net.runelite.api.coords.WorldPoint... points)
            
            Creates a 2-D polygonal area
            
            Parameters:
            
            `points` - - Polygonal array of edges
            
    
    *   ### Method Detail
        
        *   #### containsPoint
            
            public boolean containsPoint(net.runelite.api.coords.WorldPoint point)
            
        
        *   #### randomTile
            
            public net.runelite.api.coords.WorldPoint randomTile()
            
        
        *   #### getWorldPoints
            
            public net.runelite.api.coords.WorldPoint\[\] getWorldPoints()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/WorldArea.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/SimplePair.html "class in simple.robot.utils")
*   Next Class

*   [Frames](../../../index.html?simple/robot/utils/WorldArea.html)
*   [No Frames](WorldArea.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)