SimpleEntityQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleEntityQuery"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":42}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleEntityQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleEntityQuery.html)
*   [No Frames](SimpleEntityQuery.html)

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

Class SimpleEntityQuery<K extends [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces") & [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces") & [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces") & [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")\>
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   simple.hooks.queries.SimpleEntityQuery<K>

*   All Implemented Interfaces:
    
    java.lang.Iterable<K>
    
    Direct Known Subclasses:
    
    [SimpleGroundItems](../../../simple/hooks/filters/SimpleGroundItems.html "class in simple.hooks.filters"), [SimpleNpcs](../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters"), [SimpleObjects](../../../simple/hooks/filters/SimpleObjects.html "class in simple.hooks.filters")
    
    * * *
    
      
    
    public abstract class SimpleEntityQuery<K extends [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces") & [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces") & [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces") & [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")\>
    extends [SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<K>,K>
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-int...-)(int... ids)`
        
        Will filter out all items whose id isn't one of the elements inside of the {ids} array
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items whose name doesn't' match any of the patterns
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)`
        
        Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.lang.String...-)(java.lang.String... names)`
        
        Will filter out all items whose name isn't one of the elements inside of the {names} array
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.robot.utils.WorldArea-)([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)`
        
        Will filter out all items who are not inside of the specified area
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-net.runelite.api.coords.WorldPoint...-)(net.runelite.api.coords.WorldPoint... points)`
        
        Will filter out all items whose location are not one of those inside of the array {points}
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filterHasAction](../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.util.regex.Pattern...-)(java.util.regex.Pattern... patterns)`
        
        Will filter out all items who don't have any actions that match any of the patterns
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filterHasAction](../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.lang.String...-)(java.lang.String... actions)`
        
        Will filter out all items who don't have any actions that are inside of the {actions} array
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filterWithin](../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-int-)(int distance)`
        
        Will filter out all items not within specified distance to the local player
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[filterWithin](../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-net.runelite.api.coords.WorldPoint-int-)(net.runelite.api.coords.WorldPoint worldPoint, int distance)`
        
        Will filter out all items not within specified distance to said {worldPoint}
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest--)()`
        
        Will sort the query by closest distance to our local player
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will sort the query by closest distance to the location of said {locatable} object
        
        `[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        `[nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-net.runelite.api.coords.WorldPoint-)(net.runelite.api.coords.WorldPoint point)`
        
        Will sort the query by closest distance to the specified worldpoint {point}
        
        `[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")`
        
        `[nextNearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nextNearest--)()`
        
        Deprecated. 
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Method Detail
        
        *   #### nextNearest
            
            @Deprecated
            public [K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery") nextNearest()
            
            Deprecated. 
            
            DO NOT USE!!!! Please refrain from using this method as it sorts the query every time you call it and rather use \`.nearest().next()\` Will sort the query by closest distance to the local player and return the \`next#\` method from the query
            
            Returns:
            
            the closest item to our local player inside of our query
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter(int... ids)
            
            Will filter out all items whose id isn't one of the elements inside of the {ids} array
            
            Parameters:
            
            `ids` - array of ids for our filter
            
            Returns:
            
            returns the query of only items whose id's match one of those inside of {ids}
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter(java.lang.String... names)
            
            Will filter out all items whose name isn't one of the elements inside of the {names} array
            
            Parameters:
            
            `names` - array of names for our filter
            
            Returns:
            
            returns the query of only items whose name matches one of those inside of {name}
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter(java.util.regex.Pattern... patterns)
            
            Will filter out all items whose name doesn't' match any of the patterns
            
            Parameters:
            
            `patterns` - regex patterns for our filter to check
            
            Returns:
            
            returns query of only items whose name matches one of the patterns inside of {patterns}
            
        
        *   #### filterHasAction
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filterHasAction(java.lang.String... actions)
            
            Will filter out all items who don't have any actions that are inside of the {actions} array
            
            Parameters:
            
            `actions` - array of actions for our filter
            
            Returns:
            
            returns the query of only items whose actions matches one of those inside of {actions}
            
        
        *   #### filterHasAction
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filterHasAction(java.util.regex.Pattern... patterns)
            
            Will filter out all items who don't have any actions that match any of the patterns
            
            Parameters:
            
            `patterns` - regex patterns for our filter to check
            
            Returns:
            
            returns query of only items whose action(s) matches one of the patterns inside of {patterns}
            
        
        *   #### nearest
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> nearest()
            
            Will sort the query by closest distance to our local player
            
            Returns:
            
            returns a sorted query by closest distance to our local player
            
        
        *   #### nearest
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> nearest(net.runelite.api.coords.WorldPoint point)
            
            Will sort the query by closest distance to the specified worldpoint {point}
            
            Parameters:
            
            `point` - world point to sort our query by
            
            Returns:
            
            returns a sorted query by closest distance to {point}
            
        
        *   #### nearest
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> nearest([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)
            
            Will sort the query by closest distance to the location of said {locatable} object
            
            Parameters:
            
            `locatable` - locatable object to sort our query by
            
            Returns:
            
            returns a sorted query by closest distance to {locatable}
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter([SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)
            
            Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
            
            Parameters:
            
            `locatables` - array of locatable objects for our filter to check
            
            Returns:
            
            returns query of only items whose location are one of the locatable objects location inside of {locatables}
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter(net.runelite.api.coords.WorldPoint... points)
            
            Will filter out all items whose location are not one of those inside of the array {points}
            
            Parameters:
            
            `points` - array of worldpoints for our filter to check
            
            Returns:
            
            returns query of only items whose location are one of the worldpoints inside of {points}
            
        
        *   #### filter
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filter([WorldArea](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils") area)
            
            Will filter out all items who are not inside of the specified area
            
            Parameters:
            
            `area` - area for our filter to check
            
            Returns:
            
            returns query of only items inside of the specified area
            
        
        *   #### filterWithin
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filterWithin(int distance)
            
            Will filter out all items not within specified distance to the local player
            
            Parameters:
            
            `distance` - - radius to check around player
            
            Returns:
            
            returns all items within specified distance to the local player
            
        
        *   #### filterWithin
            
            public [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")\> filterWithin(net.runelite.api.coords.WorldPoint worldPoint,
                                                     int distance)
            
            Will filter out all items not within specified distance to said {worldPoint}
            
            Parameters:
            
            `distance` - - radius to check around {worldPoint}
            
            `worldPoint` - - point to filter around
            
            Returns:
            
            returns all items within specified distance to said {worldPoint}
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleEntityQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleEntityQuery.html)
*   [No Frames](SimpleEntityQuery.html)

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