SimpleEquipment   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleEquipment"; } } catch(err) { } //--> var methods = {"i0":10,"i1":42,"i2":10,"i3":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleEquipment.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleEquipment.html)
*   [No Frames](SimpleEquipment.html)

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

simple.hooks.filters

Class SimpleEquipment
---------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimpleEquipment

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimpleEquipment
    extends [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleEquipment](../../../simple/hooks/filters/SimpleEquipment.html#SimpleEquipment-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        `[getEquippedItem](../../../simple/hooks/filters/SimpleEquipment.html#getEquippedItem-simple.hooks.filters.SimpleEquipment.EquipmentSlot-)([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)` 
        
        `net.runelite.api.widgets.WidgetItem`
        
        `[getEquippedItem](../../../simple/hooks/filters/SimpleEquipment.html#getEquippedItem-net.runelite.api.widgets.WidgetInfo-)(net.runelite.api.widgets.WidgetInfo equip)`
        
        Deprecated. 
        
        `boolean`
        
        `[isEquipped](../../../simple/hooks/filters/SimpleEquipment.html#isEquipped-simple.hooks.filters.SimpleEquipment.EquipmentSlot-)([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)` 
        
        `boolean`
        
        `[sendRemove](../../../simple/hooks/filters/SimpleEquipment.html#sendRemove-simple.hooks.filters.SimpleEquipment.EquipmentSlot-)([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)`
        
        Will remove the specified item from the specified equipment slot.
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-), [population](../../../simple/hooks/queries/SimpleItemQuery.html#population-boolean-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### SimpleEquipment
            
            public SimpleEquipment([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### sendRemove
            
            public boolean sendRemove([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)
            
            Will remove the specified item from the specified equipment slot. Will open the equipment tab if it's not currently open
            
            Parameters:
            
            `slot` - the equipment slot to check
            
            Returns:
            
            returns if the item was removed or not
            
        
        *   #### getEquippedItem
            
            public [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") getEquippedItem([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)
            
        
        *   #### isEquipped
            
            public boolean isEquipped([SimpleEquipment.EquipmentSlot](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)
            
        
        *   #### getEquippedItem
            
            @Deprecated
            public net.runelite.api.widgets.WidgetItem getEquippedItem(net.runelite.api.widgets.WidgetInfo equip)
            
            Deprecated. 
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleEquipment.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleEquipment.html)
*   [No Frames](SimpleEquipment.html)

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