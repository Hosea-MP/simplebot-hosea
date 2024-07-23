SimpleGroundItem   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleGroundItem"; } } catch(err) { } //--> var methods = {"i0":42,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleGroundItem.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleChatOption.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleGroundItem.html)
*   [No Frames](SimpleGroundItem.html)

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

simple.hooks.wrappers

Class SimpleGroundItem
----------------------

*   java.lang.Object
*   *   [simple.hooks.wrappers.Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    *   *   simple.hooks.wrappers.SimpleGroundItem

*   All Implemented Interfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public class SimpleGroundItem
    extends [Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    implements [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleGroundItem](../../../simple/hooks/wrappers/SimpleGroundItem.html#SimpleGroundItem-net.runelite.api.TileItem-net.runelite.api.Tile-)(net.runelite.api.TileItem item, net.runelite.api.Tile tile)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleGroundItem.html#click-int-)(int option)`
        
        Deprecated. 
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleGroundItem.html#click-java.lang.String-)(java.lang.String action)`
        
        This makes mouse click with option
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleGroundItem.html#click-java.lang.String-java.lang.String-)(java.lang.String action, java.lang.String option)` 
        
        `java.lang.String[]`
        
        `[getActions](../../../simple/hooks/wrappers/SimpleGroundItem.html#getActions--)()`
        
        Returns Actions of the object
        
        `java.awt.geom.Rectangle2D`
        
        `[getClickBounds](../../../simple/hooks/wrappers/SimpleGroundItem.html#getClickBounds--)()` 
        
        `int`
        
        `[getId](../../../simple/hooks/wrappers/SimpleGroundItem.html#getId--)()`
        
        Returns id of the object
        
        `net.runelite.api.TileItem`
        
        `[getItem](../../../simple/hooks/wrappers/SimpleGroundItem.html#getItem--)()` 
        
        `net.runelite.api.ItemComposition`
        
        `[getItemDefinitions](../../../simple/hooks/wrappers/SimpleGroundItem.html#getItemDefinitions--)()` 
        
        `net.runelite.api.coords.WorldPoint`
        
        `[getLocation](../../../simple/hooks/wrappers/SimpleGroundItem.html#getLocation--)()`
        
        Position in world of object
        
        `java.lang.String`
        
        `[getName](../../../simple/hooks/wrappers/SimpleGroundItem.html#getName--)()`
        
        The name of said object
        
        `int`
        
        `[getQuantity](../../../simple/hooks/wrappers/SimpleGroundItem.html#getQuantity--)()` 
        
        `net.runelite.api.Tile`
        
        `[getTile](../../../simple/hooks/wrappers/SimpleGroundItem.html#getTile--)()` 
        
        `boolean`
        
        `[isStackable](../../../simple/hooks/wrappers/SimpleGroundItem.html#isStackable--)()` 
        
        *   ### Methods inherited from class simple.hooks.wrappers.[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
            
            `[clickOnMinimap](../../../simple/hooks/wrappers/Clickable.html#clickOnMinimap--), [getPointForType](../../../simple/hooks/wrappers/Clickable.html#getPointForType--), [turnTo](../../../simple/hooks/wrappers/Clickable.html#turnTo--), [validateInteractable](../../../simple/hooks/wrappers/Clickable.html#validateInteractable--), [visibleOnScreen](../../../simple/hooks/wrappers/Clickable.html#visibleOnScreen--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`

*   *   ### Constructor Detail
        
        *   #### SimpleGroundItem
            
            public SimpleGroundItem(net.runelite.api.TileItem item,
                                    net.runelite.api.Tile tile)
            
    
    *   ### Method Detail
        
        *   #### getLocation
            
            public net.runelite.api.coords.WorldPoint getLocation()
            
            Description copied from interface: `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)`
            
            Position in world of object
            
            Specified by:
            
            `[getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)` in interface `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- Worldpoint of the locatable wrapper
            
        
        *   #### getName
            
            public java.lang.String getName()
            
            Description copied from interface: `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)`
            
            The name of said object
            
            Specified by:
            
            `[getName](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)` in interface `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- the name of this object
            
        
        *   #### getClickBounds
            
            public java.awt.geom.Rectangle2D getClickBounds()
            
        
        *   #### getId
            
            public int getId()
            
            Description copied from interface: `[SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html#getId--)`
            
            Returns id of the object
            
            Specified by:
            
            `[getId](../../../simple/hooks/interfaces/SimpleIdentifiable.html#getId--)` in interface `[SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- id of said object
            
        
        *   #### getQuantity
            
            public int getQuantity()
            
        
        *   #### getItemDefinitions
            
            public net.runelite.api.ItemComposition getItemDefinitions()
            
        
        *   #### getItem
            
            public net.runelite.api.TileItem getItem()
            
        
        *   #### getTile
            
            public net.runelite.api.Tile getTile()
            
        
        *   #### isStackable
            
            public boolean isStackable()
            
        
        *   #### getActions
            
            public java.lang.String\[\] getActions()
            
            Description copied from interface: `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)`
            
            Returns Actions of the object
            
            Specified by:
            
            `[getActions](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)` in interface `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- actions array of said object
            
        
        *   #### click
            
            public boolean click(java.lang.String action)
            
            Description copied from class: `[Clickable](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)`
            
            This makes mouse click with option
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
            Returns:
            
        
        *   #### click
            
            public boolean click(java.lang.String action,
                                 java.lang.String option)
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### click
            
            @Deprecated
            public boolean click(int option)
            
            Deprecated. 
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-int-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleGroundItem.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleChatOption.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleGroundItem.html)
*   [No Frames](SimpleGroundItem.html)

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