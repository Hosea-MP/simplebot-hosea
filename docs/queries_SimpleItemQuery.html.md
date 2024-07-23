SimpleItemQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleItemQuery"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItemQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleItemQuery.html)
*   [No Frames](SimpleItemQuery.html)

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

simple.hooks.queries

Class SimpleItemQuery<K extends [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
-------------------------------------------------------------------------------------------------------------------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   simple.hooks.queries.SimpleItemQuery<K>

*   All Implemented Interfaces:
    
    java.lang.Iterable<K>
    
    Direct Known Subclasses:
    
    [SimpleBank](../../../simple/hooks/filters/SimpleBank.html "class in simple.hooks.filters"), [SimpleEquipment](../../../simple/hooks/filters/SimpleEquipment.html "class in simple.hooks.filters"), [SimpleInventory](../../../simple/hooks/filters/SimpleInventory.html "class in simple.hooks.filters"), [SimpleShop](../../../simple/hooks/filters/SimpleShop.html "class in simple.hooks.filters")
    
    * * *
    
      
    
    public abstract class SimpleItemQuery<K extends [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    extends [SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-)(int... ids)`
        
        Will filter out all items whose id isn't one of the elements inside of the {ids} array
        
        `[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items whose name doesn't' match any of the patterns
        
        `[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-)(java.lang.String... names)`
        
        Will filter out all items whose name isn't one of the elements inside of the {names} array
        
        `[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        `[filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items who don't have any actions that match any of the patterns
        
        `[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        `[filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-)(java.lang.String... actions)`
        
        Will filter out all items who don't have any actions that are inside of the {actions} array
        
        `int`
        
        `[population](../../../simple/hooks/queries/SimpleItemQuery.html#population-boolean-)(boolean stacks)`
        
        Will return the amount of items inside of the query by their stack sizes
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Method Detail
        
        *   #### population
            
            public int population(boolean stacks)
            
            Will return the amount of items inside of the query by their stack sizes
            
            Returns:
            
            returns the current size of the query by total item stack sizes
            
        
        *   #### filter
            
            public [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")\> filter(int... ids)
            
            Will filter out all items whose id isn't one of the elements inside of the {ids} array
            
            Parameters:
            
            `ids` - array of ids for our filter
            
            Returns:
            
            returns the query of only items whose id's match one of those inside of {ids}
            
        
        *   #### filter
            
            public [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")\> filter(java.lang.String... names)
            
            Will filter out all items whose name isn't one of the elements inside of the {names} array
            
            Parameters:
            
            `names` - array of names for our filter
            
            Returns:
            
            returns the query of only items whose name matches one of those inside of {name}
            
        
        *   #### filter
            
            public [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")\> filter(java.util.regex.Pattern... patterns)
            
            Will filter out all items whose name doesn't' match any of the patterns
            
            Parameters:
            
            `patterns` - regex patterns for our filter to check
            
            Returns:
            
            returns query of only items whose name matches one of the patterns inside of {patterns}
            
        
        *   #### filterHasAction
            
            public [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")\> filterHasAction(java.lang.String... actions)
            
            Will filter out all items who don't have any actions that are inside of the {actions} array
            
            Parameters:
            
            `actions` - array of actions for our filter
            
            Returns:
            
            returns the query of only items whose actions matches one of those inside of {actions}
            
        
        *   #### filterHasAction
            
            public [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")\> filterHasAction(java.util.regex.Pattern... patterns)
            
            Will filter out all items who don't have any actions that match any of the patterns
            
            Parameters:
            
            `patterns` - regex patterns for our filter to check
            
            Returns:
            
            returns query of only items whose action(s) matches one of the patterns inside of {patterns}
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItemQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleItemQuery.html)
*   [No Frames](SimpleItemQuery.html)

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