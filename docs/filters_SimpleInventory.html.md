SimpleInventory   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleInventory"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleInventory.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleGroundItems.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleInventory.html)
*   [No Frames](SimpleInventory.html)

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

simple.hooks.filters

Class SimpleInventory
---------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimpleInventory

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimpleInventory
    extends [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleInventory](../../../simple/hooks/filters/SimpleInventory.html#SimpleInventory-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[canPickupItem](../../../simple/hooks/filters/SimpleInventory.html#canPickupItem-simple.hooks.wrappers.SimpleGroundItem-)([SimpleGroundItem](../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers") groundItem)`
        
        Will return if you have enough space to pickup a grounditem or not.
        
        `boolean`
        
        `[dropItem](../../../simple/hooks/filters/SimpleInventory.html#dropItem-simple.hooks.wrappers.SimpleItem-)([SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") item)` 
        
        `boolean`
        
        `[dropItems](../../../simple/hooks/filters/SimpleInventory.html#dropItems--)()`
        
        Will attempt to either shift-click drop or right click drop all items in the query
        
        `boolean`
        
        `[dropItems](../../../simple/hooks/filters/SimpleInventory.html#dropItems-simple.hooks.queries.SimpleItemQuery-)([SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")> itemQuery)`
        
        Will attempt to either shift-click drop or right click drop all items in the specified query
        
        `int`
        
        `[getFreeSlots](../../../simple/hooks/filters/SimpleInventory.html#getFreeSlots--)()`
        
        Will return the amount of free slots in your inventory, NOTE: This method DOES NOT populate the query
        
        `boolean`
        
        `[inventoryFull](../../../simple/hooks/filters/SimpleInventory.html#inventoryFull--)()`
        
        Will return {true} if your inventory is full otherwise {false}, NOTE: This method DOES NOT populate the query
        
        `boolean`
        
        `[itemOnItem](../../../simple/hooks/filters/SimpleInventory.html#itemOnItem-simple.hooks.wrappers.SimpleItem-simple.hooks.wrappers.SimpleItem-)([SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") first, [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") second)`
        
        Will attempt to use an item on another item, will tab to your inventory if it is not currently opened
        
        `int`
        
        `[itemSelectionState](../../../simple/hooks/filters/SimpleInventory.html#itemSelectionState--)()` 
        
        `boolean`
        
        `[shiftDroppingEnabled](../../../simple/hooks/filters/SimpleInventory.html#shiftDroppingEnabled--)()`
        
        Will return {true} if you have shift-dropping enabled otherwise {false}
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-), [population](../../../simple/hooks/queries/SimpleItemQuery.html#population-boolean-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### SimpleInventory
            
            public SimpleInventory([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)
            
    
    *   ### Method Detail
        
        *   #### dropItem
            
            public boolean dropItem([SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") item)
            
        
        *   #### dropItems
            
            public boolean dropItems()
            
            Will attempt to either shift-click drop or right click drop all items in the query
            
            Returns:
            
            \- returns {true} if one or more items in the query have been dropped, if inventory is empty will return {false}
            
        
        *   #### dropItems
            
            public boolean dropItems([SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\> itemQuery)
            
            Will attempt to either shift-click drop or right click drop all items in the specified query
            
            Parameters:
            
            `itemQuery` - the query of items to drop
            
            Returns:
            
            \- returns {true} if one or more items in the specified query have been dropped, if inventory is empty will return {false}
            
        
        *   #### inventoryFull
            
            public boolean inventoryFull()
            
            Will return {true} if your inventory is full otherwise {false}, NOTE: This method DOES NOT populate the query
            
            Returns:
            
        
        *   #### getFreeSlots
            
            public int getFreeSlots()
            
            Will return the amount of free slots in your inventory, NOTE: This method DOES NOT populate the query
            
            Returns:
            
        
        *   #### shiftDroppingEnabled
            
            public boolean shiftDroppingEnabled()
            
            Will return {true} if you have shift-dropping enabled otherwise {false}
            
            Returns:
            
        
        *   #### itemOnItem
            
            public boolean itemOnItem([SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") first,
                                      [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") second)
            
            Will attempt to use an item on another item, will tab to your inventory if it is not currently opened
            
            Parameters:
            
            `first` - - The item to use on the second item for example a chisel
            
            `second` - - The item being used upon for example an uncut emerald
            
            Returns:
            
            Will return {true} if the second item has been used, {false} if inventory isn't open or if either fail to be used or only the first item has been clicked
            
        
        *   #### canPickupItem
            
            public boolean canPickupItem([SimpleGroundItem](../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers") groundItem)
            
            Will return if you have enough space to pickup a grounditem or not. Checks if it's stackable, if you have space to pick it up or not and if your inventory is full or not
            
            Parameters:
            
            `groundItem` - the item to attempt to pickup
            
            Returns:
            
            returns if you are able to pickup said {groundItem}
            
        
        *   #### itemSelectionState
            
            public int itemSelectionState()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleInventory.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleGroundItems.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleInventory.html)
*   [No Frames](SimpleInventory.html)

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