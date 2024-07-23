Uses of Interface simple.hooks.interfaces.SimpleLocatable   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Interface simple.hooks.interfaces.SimpleLocatable"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/interfaces/class-use/SimpleLocatable.html)
*   [No Frames](SimpleLocatable.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Interface  
simple.hooks.interfaces.SimpleLocatable
-----------------------------------------------------------

*   Packages that use [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
    
    Package
    
    Description
    
    [simple.hooks.interfaces](#simple.hooks.interfaces)
    
     
    
    [simple.hooks.queries](#simple.hooks.queries)
    
     
    
    [simple.hooks.simplebot](#simple.hooks.simplebot)
    
     
    
    [simple.hooks.wrappers](#simple.hooks.wrappers)
    
     
    
*   *   ### Uses of [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") in [simple.hooks.interfaces](../../../../simple/hooks/interfaces/package-summary.html)
        
        Subinterfaces of [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") in [simple.hooks.interfaces](../../../../simple/hooks/interfaces/package-summary.html) 
        
        Modifier and Type
        
        Interface and Description
        
        `interface` 
        
        `[SimpleActor](../../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces")`
        
        Created by Seth on Nov 4, 2019 at 6:40:44 PM.
        
        `interface` 
        
        `[SimpleInteractable](../../../../simple/hooks/interfaces/SimpleInteractable.html "interface in simple.hooks.interfaces")`
        
        Created by Seth on Nov 4, 2019 at 6:49:17 PM.
        
        Methods in [simple.hooks.interfaces](../../../../simple/hooks/interfaces/package-summary.html) with parameters of type [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
        
        Modifier and Type
        
        Method and Description
        
        `default int`
        
        SimpleLocatable.`[distanceTo](../../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to)`
        
        Distance to object {to}
        
        `default boolean`
        
        SimpleLocatable.`[withinRange](../../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") to, int range)`
        
        If object is within {range} of {to}
        
    *   ### Uses of [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html)
        
        Classes in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) with type parameters of type [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<K extends [SimpleActionable](../../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces") & [SimpleIdentifiable](../../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces") & [SimpleNamable](../../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces") & [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")>` 
        
        `class` 
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<K extends [SimpleActionable](../../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces") & [SimpleNamable](../../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces") & [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")>` 
        
        Methods in [simple.hooks.queries](../../../../simple/hooks/queries/package-summary.html) with parameters of type [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[filter](../../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)`
        
        Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[filter](../../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")... locatables)`
        
        Will filter out all items whose location doesn't match any of the locatable objects in the {locatables} array
        
        `[SimplePlayerQuery](../../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimplePlayerQuery.html "type parameter in SimplePlayerQuery")>`
        
        SimplePlayerQuery.`[nearest](../../../../simple/hooks/queries/SimplePlayerQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will sort the query by closest distance to the location of said {locatable} object
        
        `[SimpleEntityQuery](../../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[K](../../../../simple/hooks/queries/SimpleEntityQuery.html "type parameter in SimpleEntityQuery")>`
        
        SimpleEntityQuery.`[nearest](../../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will sort the query by closest distance to the location of said {locatable} object
        
    *   ### Uses of [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html)
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) with parameters of type [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
        
        Modifier and Type
        
        Method and Description
        
        `double`
        
        Pathing.`[collisionDistance](../../../../simple/hooks/simplebot/Pathing.html#collisionDistance-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        Will return the collision collisionDistance to said locatable from players location
        
        `int`
        
        Pathing.`[collisionDistance](../../../../simple/hooks/simplebot/Pathing.html#collisionDistance-simple.hooks.interfaces.SimpleLocatable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1, [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)` 
        
        `boolean`
        
        Pathing.`[onTile](../../../../simple/hooks/simplebot/Pathing.html#onTile-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)` 
        
        `boolean`
        
        Pathing.`[reachable](../../../../simple/hooks/simplebot/Pathing.html#reachable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)`
        
        will return {true} if the specified tile is not blocked and will return {false} if it is.
        
        `boolean`
        
        Pathing.`[reachable](../../../../simple/hooks/simplebot/Pathing.html#reachable-simple.hooks.interfaces.SimpleLocatable-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable1, [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable2)`
        
        will return whether or not point1 can reach point2
        
        `boolean`
        
        Viewport.`[turnTo](../../../../simple/hooks/simplebot/Viewport.html#turnTo-simple.hooks.interfaces.SimpleLocatable-)([SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") locatable)` 
        
    *   ### Uses of [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html)
        
        Classes in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html) that implement [SimpleLocatable](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces") 
        
        Modifier and Type
        
        Class and Description
        
        `class` 
        
        `[SimpleGroundItem](../../../../simple/hooks/wrappers/SimpleGroundItem.html "class in simple.hooks.wrappers")` 
        
        `class` 
        
        `[SimpleLocalPlayer](../../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")` 
        
        `class` 
        
        `[SimpleNpc](../../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers")` 
        
        `class` 
        
        `[SimpleObject](../../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")` 
        
        `class` 
        
        `[SimplePlayer](../../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")` 
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/interfaces/class-use/SimpleLocatable.html)
*   [No Frames](SimpleLocatable.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->