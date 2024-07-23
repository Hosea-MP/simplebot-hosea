Uses of Class simple.hooks.wrappers.SimpleItem   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.hooks.wrappers.SimpleItem"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/wrappers/class-use/SimpleItem.html)
*   [No Frames](SimpleItem.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.hooks.wrappers.SimpleItem
------------------------------------------------

*   Packages that use [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
    
    Package
    
    Description
    
    [simple.hooks.filters](#simple.hooks.filters)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
    [simple.hooks.simplebot](#simple.hooks.simplebot)
    
     
    
    [simple.hooks.wrappers](#simple.hooks.wrappers)
    
     
    
*   *   ### Uses of [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html)
        
        Methods in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) that return [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        SimpleEquipment.`[getEquippedItem](../../../../simple/hooks/filters/SimpleEquipment.html#getEquippedItem-simple.hooks.filters.SimpleEquipment.EquipmentSlot-)([SimpleEquipment.EquipmentSlot](../../../../simple/hooks/filters/SimpleEquipment.EquipmentSlot.html "enum in simple.hooks.filters") slot)` 
        
        Methods in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) with parameters of type [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        SimpleInventory.`[dropItem](../../../../simple/hooks/filters/SimpleInventory.html#dropItem-simple.hooks.wrappers.SimpleItem-)([SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") item)` 
        
        `boolean`
        
        SimpleInventory.`[itemOnItem](../../../../simple/hooks/filters/SimpleInventory.html#itemOnItem-simple.hooks.wrappers.SimpleItem-simple.hooks.wrappers.SimpleItem-)([SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") first, [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") second)`
        
        Will attempt to use an item on another item, will tab to your inventory if it is not currently opened
        
        `void`
        
        SimpleNpcs.`[useItemOnNPC](../../../../simple/hooks/filters/SimpleNpcs.html#useItemOnNPC-simple.hooks.wrappers.SimpleNpc-simple.hooks.wrappers.SimpleItem-)([SimpleNpc](../../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers") npc, [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") item)` 
        
        Method parameters in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) with type arguments of type [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        SimpleBank.`[depositAllExcept](../../../../simple/hooks/filters/SimpleBank.html#depositAllExcept-java.util.function.Predicate-)(java.util.function.Predicate<[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")> filter)`
        
        Deposit's all items that aren't accepted by the {filter}
        
        `boolean`
        
        SimpleInventory.`[dropItems](../../../../simple/hooks/filters/SimpleInventory.html#dropItems-simple.hooks.queries.SimpleItemQuery-)([SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")> itemQuery)`
        
        Will attempt to either shift-click drop or right click drop all items in the specified query
        
    *   ### Uses of [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Classes in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) with type parameters of type [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K extends [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")>` 
        
    *   ### Uses of [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html)
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) that return [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        Trade.`[getItem](../../../../simple/hooks/simplebot/Trade.html#getItem-int-boolean-)(int id, boolean partner)` 
        
        `[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        Trade.`[getItemForName](../../../../simple/hooks/simplebot/Trade.html#getItemForName-java.lang.String-boolean-)(java.lang.String name, boolean partner)` 
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) that return types with arguments of type [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `java.util.ArrayList<[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")>`
        
        Trade.`[getPartnerTradeItems](../../../../simple/hooks/simplebot/Trade.html#getPartnerTradeItems--)()` 
        
        `java.util.ArrayList<[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")>`
        
        Trade.`[getYourTradeItems](../../../../simple/hooks/simplebot/Trade.html#getYourTradeItems--)()` 
        
    *   ### Uses of [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html)
        
        Methods in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html) that return [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        SimpleWidget.`[getItem](../../../../simple/hooks/wrappers/SimpleWidget.html#getItem-int-)(int index)` 
        
        `[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")[]`
        
        SimpleWidget.`[getItems](../../../../simple/hooks/wrappers/SimpleWidget.html#getItems--)()` 
        
        Methods in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html) with parameters of type [SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `void`
        
        SimplePlayer.`[useItemOnPlayer](../../../../simple/hooks/wrappers/SimplePlayer.html#useItemOnPlayer-simple.hooks.wrappers.SimpleItem-)([SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") item)` 
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/wrappers/class-use/SimpleItem.html)
*   [No Frames](SimpleItem.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->