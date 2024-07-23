SimpleShop   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleShop"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleShop.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleShop.html)
*   [No Frames](SimpleShop.html)

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

Class SimpleShop
----------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimpleShop

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimpleShop
    extends [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters")`
        
        An enum of the Amounts you can click in the shop
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleShop](../../../simple/hooks/filters/SimpleShop.html#SimpleShop-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[buy](../../../simple/hooks/filters/SimpleShop.html#buy-int-simple.hooks.filters.SimpleShop.Amount-)(int id, [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)`
        
        returns if the specified item by name={name} has been purchased in amount={Amount}
        
        `boolean`
        
        `[buy](../../../simple/hooks/filters/SimpleShop.html#buy-java.lang.String-simple.hooks.filters.SimpleShop.Amount-)(java.lang.String name, [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)`
        
        returns if the specified item by name={name} has been purchased in amount={Amount}
        
        `boolean`
        
        `[closeShop](../../../simple/hooks/filters/SimpleShop.html#closeShop--)()`
        
        will close the shop widget if the shop is open, {true} if it's been closed, {false} otherwise
        
        `java.lang.String`
        
        `[name](../../../simple/hooks/filters/SimpleShop.html#name--)()`
        
        returns the name of the open shop
        
        `boolean`
        
        `[sell](../../../simple/hooks/filters/SimpleShop.html#sell-int-simple.hooks.filters.SimpleShop.Amount-)(int id, [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)`
        
        returns if the specified item by id={id} has been sold in amount={Amount}
        
        `boolean`
        
        `[sell](../../../simple/hooks/filters/SimpleShop.html#sell-java.lang.String-simple.hooks.filters.SimpleShop.Amount-)(java.lang.String name, [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)`
        
        returns if the specified item by name={name} has been sold in amount={Amount}
        
        `boolean`
        
        `[shopOpen](../../../simple/hooks/filters/SimpleShop.html#shopOpen--)()`
        
        returns {true} if a shop is open, {false} otherwise
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-), [population](../../../simple/hooks/queries/SimpleItemQuery.html#population-boolean-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### SimpleShop
            
            public SimpleShop([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### name
            
            public java.lang.String name()
            
            returns the name of the open shop
            
            Returns:
            
        
        *   #### shopOpen
            
            public boolean shopOpen()
            
            returns {true} if a shop is open, {false} otherwise
            
            Returns:
            
        
        *   #### closeShop
            
            public boolean closeShop()
            
            will close the shop widget if the shop is open, {true} if it's been closed, {false} otherwise
            
            Returns:
            
        
        *   #### buy
            
            public boolean buy(java.lang.String name,
                               [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)
            
            returns if the specified item by name={name} has been purchased in amount={Amount}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### buy
            
            public boolean buy(int id,
                               [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)
            
            returns if the specified item by name={name} has been purchased in amount={Amount}
            
            Parameters:
            
            `id` -
            
            `amount` -
            
            Returns:
            
        
        *   #### sell
            
            public boolean sell(java.lang.String name,
                                [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)
            
            returns if the specified item by name={name} has been sold in amount={Amount}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### sell
            
            public boolean sell(int id,
                                [SimpleShop.Amount](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters") amount)
            
            returns if the specified item by id={id} has been sold in amount={Amount}
            
            Parameters:
            
            `id` -
            
            `amount` -
            
            Returns:
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleShop.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleShop.html)
*   [No Frames](SimpleShop.html)

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