Uses of Class simple.hooks.queries.SimplePlayerQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.hooks.queries.SimplePlayerQuery"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimplePlayerQuery.html)
*   [No Frames](SimplePlayerQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.hooks.queries.SimplePlayerQuery
------------------------------------------------------

*   Packages that use [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") 
    
    Package
    
    Description
    
    [simple.hooks.filters](#simple.hooks.filters)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
    [simple.hooks.simplebot](#simple.hooks.simplebot)
    
     
    
*   *   ### Uses of [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html)
        
        Subclasses of [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimplePlayers](../../../../simple/hooks/filters/SimplePlayers.html "class in simple.hooks.filters")` 
        
    *   ### Uses of [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Methods in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) that return [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items whose name doesn't' match any of the patterns
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)`
        
        Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-java.lang.String...-)(java.lang.String... names)`
        
        Will filter out all items whose name isn't one of the elements inside of the {names} array
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.robot.utils.WorldArea-)([WorldArea](../../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will filter out all items who are not inside of the specified area
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Will filter out all items whose location are not one of those inside of the array {points}
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filterHasAction](../../../../simple/hooks/queries/SimplePlayerQuery.html#filterHasAction-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items who don't have any actions that match any of the patterns
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filterHasAction](../../../../simple/hooks/queries/SimplePlayerQuery.html#filterHasAction-java.lang.String...-)(java.lang.String... actions)`
        
        Will filter out all items who don't have any actions that are inside of the {actions} array
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filterWithin](../../../../simple/hooks/queries/SimplePlayerQuery.html#filterWithin-int-)(int distance)`
        
        Will filter out all items not within specified distance to the local player
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filterWithin](../../../../simple/hooks/queries/SimplePlayerQuery.html#filterWithin-net.runelite.api.coords.WorldPoint-int-)(net.runelite.api.coords.WorldPoint worldPoint, int distance)`
        
        Will filter out all items not within specified distance to said {worldPoint}
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[nearest](../../../../simple/hooks/queries/SimplePlayerQuery.html#nearest--)()`
        
        Will sort the query by closest distance to our local player
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[nearest](../../../../simple/hooks/queries/SimplePlayerQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will sort the query by closest distance to the location of said {locatable} object
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[nearest](../../../../simple/hooks/queries/SimplePlayerQuery.html#nearest-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        Will sort the query by closest distance to the specified worldpoint {point}
        
    *   ### Uses of [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html)
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) that return [SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[SimplePlayer](../../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")>`
        
        AntiBan.`[nearbyStaff](../../../../simple/hooks/simplebot/AntiBan.html#nearbyStaff--)()` 
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/queries/class-use/SimplePlayerQuery.html)
*   [No Frames](SimplePlayerQuery.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->