SimpleItem   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleItem"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItem.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleItem.html)
*   [No Frames](SimpleItem.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.wrappers

Class SimpleItem
----------------

*   java.lang.Object
*   *   [simple.hooks.wrappers.Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    *   *   simple.hooks.wrappers.SimpleItem

*   All Implemented Interfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces"), [SimpleStackable](../../../simple/hooks/interfaces/SimpleStackable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public class SimpleItem
    extends [Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    implements [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces"), [SimpleStackable](../../../simple/hooks/interfaces/SimpleStackable.html "interface in simple.hooks.interfaces")
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html#SimpleItem-int-int-simple.hooks.wrappers.SimpleItem.ItemType-)(int id, int quantity, [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html#SimpleItem-net.runelite.api.Item-int-)(net.runelite.api.Item i, int inventoryIndex)` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html#SimpleItem-net.runelite.api.Item-int-simple.hooks.wrappers.SimpleItem.ItemType-)(net.runelite.api.Item i, int inventoryIndex, [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html#SimpleItem-net.runelite.api.widgets.WidgetItem-)(net.runelite.api.widgets.WidgetItem wi)` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html#SimpleItem-net.runelite.api.widgets.WidgetItem-simple.hooks.wrappers.SimpleItem.ItemType-)(net.runelite.api.widgets.WidgetItem wi, [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleItem.html#click-int-)(int option)` 
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleItem.html#click-java.lang.String-)(java.lang.String option)`
        
        This makes mouse click with option
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleItem.html#click-java.lang.String-java.lang.String-)(java.lang.String option, java.lang.String objectName)` 
        
        `java.lang.String[]`
        
        `[getActions](../../../simple/hooks/wrappers/SimpleItem.html#getActions--)()`
        
        Returns Actions of the object
        
        `java.awt.geom.Rectangle2D`
        
        `[getClickBounds](../../../simple/hooks/wrappers/SimpleItem.html#getClickBounds--)()` 
        
        `int`
        
        `[getId](../../../simple/hooks/wrappers/SimpleItem.html#getId--)()`
        
        Returns id of the object
        
        `int`
        
        `[getInventoryIndex](../../../simple/hooks/wrappers/SimpleItem.html#getInventoryIndex--)()` 
        
        `net.runelite.api.ItemComposition`
        
        `[getItemDefinitions](../../../simple/hooks/wrappers/SimpleItem.html#getItemDefinitions--)()` 
        
        `java.lang.String`
        
        `[getName](../../../simple/hooks/wrappers/SimpleItem.html#getName--)()`
        
        The name of said object
        
        `int`
        
        `[getQuantity](../../../simple/hooks/wrappers/SimpleItem.html#getQuantity--)()`
        
        The quantity of an item
        
        `net.runelite.api.widgets.WidgetItem`
        
        `[getWidgetItem](../../../simple/hooks/wrappers/SimpleItem.html#getWidgetItem--)()` 
        
        `boolean`
        
        `[isStackable](../../../simple/hooks/wrappers/SimpleItem.html#isStackable--)()` 
        
        `boolean`
        
        `[validateInteractable](../../../simple/hooks/wrappers/SimpleItem.html#validateInteractable--)()` 
        
        `boolean`
        
        `[visibleOnScreen](../../../simple/hooks/wrappers/SimpleItem.html#visibleOnScreen--)()` 
        
        *   ### Methods inherited from class simple.hooks.wrappers.[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
            
            `[clickOnMinimap](../../../simple/hooks/wrappers/Clickable.html#clickOnMinimap--), [getPointForType](../../../simple/hooks/wrappers/Clickable.html#getPointForType--), [turnTo](../../../simple/hooks/wrappers/Clickable.html#turnTo--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### SimpleItem
            
            public SimpleItem(net.runelite.api.widgets.WidgetItem wi)
            
        
        *   #### SimpleItem
            
            public SimpleItem(net.runelite.api.widgets.WidgetItem wi,
                              [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)
            
        
        *   #### SimpleItem
            
            public SimpleItem(int id,
                              int quantity,
                              [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)
            
        
        *   #### SimpleItem
            
            public SimpleItem(net.runelite.api.Item i,
                              int inventoryIndex)
            
        
        *   #### SimpleItem
            
            public SimpleItem(net.runelite.api.Item i,
                              int inventoryIndex,
                              [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") type)
            
    
    *   ### Method Detail
        
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
            
            Description copied from interface: `[SimpleStackable](../../../simple/hooks/interfaces/SimpleStackable.html#getQuantity--)`
            
            The quantity of an item
            
            Specified by:
            
            `[getQuantity](../../../simple/hooks/interfaces/SimpleStackable.html#getQuantity--)` in interface `[SimpleStackable](../../../simple/hooks/interfaces/SimpleStackable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            the items quantity
            
        
        *   #### getWidgetItem
            
            public net.runelite.api.widgets.WidgetItem getWidgetItem()
            
        
        *   #### getInventoryIndex
            
            public int getInventoryIndex()
            
        
        *   #### getName
            
            public java.lang.String getName()
            
            Description copied from interface: `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)`
            
            The name of said object
            
            Specified by:
            
            `[getName](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)` in interface `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- the name of this object
            
        
        *   #### getItemDefinitions
            
            public net.runelite.api.ItemComposition getItemDefinitions()
            
        
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
            
            public boolean click(java.lang.String option)
            
            Description copied from class: `[Clickable](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)`
            
            This makes mouse click with option
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
            Returns:
            
        
        *   #### click
            
            public boolean click(java.lang.String option,
                                 java.lang.String objectName)
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### click
            
            public boolean click(int option)
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-int-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### getClickBounds
            
            public java.awt.geom.Rectangle2D getClickBounds()
            
        
        *   #### visibleOnScreen
            
            public boolean visibleOnScreen()
            
            Overrides:
            
            `[visibleOnScreen](../../../simple/hooks/wrappers/Clickable.html#visibleOnScreen--)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### validateInteractable
            
            public boolean validateInteractable()
            
            Overrides:
            
            `[validateInteractable](../../../simple/hooks/wrappers/Clickable.html#validateInteractable--)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItem.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleItem.html)
*   [No Frames](SimpleItem.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)