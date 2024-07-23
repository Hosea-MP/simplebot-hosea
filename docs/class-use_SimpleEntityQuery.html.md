Uses of Class simple.hooks.queries.SimpleEntityQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.hooks.queries.SimpleEntityQuery"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimpleEntityQuery.html)
*   [No Frames](SimpleEntityQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.hooks.queries.SimpleEntityQuery
------------------------------------------------------

*   Packages that use [SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries") 
    
    Package
    
    Description
    
    [simple.hooks.filters](#simple.hooks.filters)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
*   *   ### Uses of [SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html)
        
        Subclasses of [SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimpleGroundItems](../../../../simple/hooks/filters/SimpleGroundItems.html "class in simple.hooks.filters")` 
        
        `class` 
        
        `[SimpleNpcs](../../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters")` 
        
        `class` 
        
        `[SimpleObjects](../../../../simple/hooks/filters/SimpleObjects.html "class in simple.hooks.filters")` 
        
    *   ### Uses of [SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Methods in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) that return [SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-int...-)(int... ids)`
        
        Will filter out all items whose id isn't one of the elements inside of the {ids} array
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items whose name doesn't' match any of the patterns
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)`
        
        Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.lang.String...-)(java.lang.String... names)`
        
        Will filter out all items whose name isn't one of the elements inside of the {names} array
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will filter out all items who are not inside of the specified area
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Will filter out all items whose location are not one of those inside of the array {points}
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filterHasAction](../../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items who don't have any actions that match any of the patterns
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filterHasAction](../../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.lang.String...-)(java.lang.String... actions)`
        
        Will filter out all items who don't have any actions that are inside of the {actions} array
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filterWithin](../../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-int-)(int distance)`
        
        Will filter out all items not within specified distance to the local player
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filterWithin](../../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-net.runelite.api.coords.WorldPoint-int-)(net.runelite.api.coords.WorldPoint worldPoint, int distance)`
        
        Will filter out all items not within specified distance to said {worldPoint}
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[nearest](../../../../simple/hooks/queries/SimpleEntityQuery.html#nearest--)()`
        
        Will sort the query by closest distance to our local player
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[nearest](../../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will sort the query by closest distance to the location of said {locatable} object
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[nearest](../../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        Will sort the query by closest distance to the specified worldpoint {point}
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimpleEntityQuery.html)
*   [No Frames](SimpleEntityQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->