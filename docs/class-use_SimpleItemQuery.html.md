Uses of Class simple.hooks.queries.SimpleItemQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.hooks.queries.SimpleItemQuery"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimpleItemQuery.html)
*   [No Frames](SimpleItemQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.hooks.queries.SimpleItemQuery
----------------------------------------------------

*   Packages that use [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") 
    
    Package
    
    Description
    
    [simple.hooks.filters](#simple.hooks.filters)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
*   *   ### Uses of [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html)
        
        Subclasses of [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimpleBank](../../../../simple/hooks/filters/SimpleBank.html "class in simple.hooks.filters")` 
        
        `class` 
        
        `[SimpleEquipment](../../../../simple/hooks/filters/SimpleEquipment.html "class in simple.hooks.filters")` 
        
        `class` 
        
        `[SimpleInventory](../../../../simple/hooks/filters/SimpleInventory.html "class in simple.hooks.filters")` 
        
        `class` 
        
        `[SimpleShop](../../../../simple/hooks/filters/SimpleShop.html "class in simple.hooks.filters")` 
        
        Methods in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) with parameters of type [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        SimpleInventory.`[dropItems](../../../../simple/hooks/filters/SimpleInventory.html#dropItems-simple.hooks.queries.SimpleItemQuery-)([SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")> itemQuery)`
        
        Will attempt to either shift-click drop or right click drop all items in the specified query
        
    *   ### Uses of [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Methods in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) that return [SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        SimpleItemQuery.`[filter](../../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-)(int... ids)`
        
        Will filter out all items whose id isn't one of the elements inside of the {ids} array
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        SimpleItemQuery.`[filter](../../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items whose name doesn't' match any of the patterns
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        SimpleItemQuery.`[filter](../../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-)(java.lang.String... names)`
        
        Will filter out all items whose name isn't one of the elements inside of the {names} array
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        SimpleItemQuery.`[filterHasAction](../../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items who don't have any actions that match any of the patterns
        
        `[SimpleItemQuery](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleItemQuery.html "type parameter in SimpleItemQuery")>`
        
        SimpleItemQuery.`[filterHasAction](../../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-)(java.lang.String... actions)`
        
        Will filter out all items who don't have any actions that are inside of the {actions} array
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimpleItemQuery.html)
*   [No Frames](SimpleItemQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->