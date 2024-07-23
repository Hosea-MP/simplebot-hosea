SimplePlayers   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimplePlayers"; } } catch(err) { } //--> var methods = {"i0":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePlayers.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleObjects.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePrayers.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimplePlayers.html)
*   [No Frames](SimplePlayers.html)

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

Class SimplePlayers
-------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimplePlayerQuery](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimplePlayerQuery](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimplePlayers

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimplePlayers
    extends [SimplePlayerQuery](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")<[SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimplePlayers](../../../simple/hooks/filters/SimplePlayers.html#SimplePlayers-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleLocalPlayer](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")`
        
        `[getLocal](../../../simple/hooks/filters/SimplePlayers.html#getLocal--)()` 
        
        *   ### Methods inherited from class simple.hooks.queries.[SimplePlayerQuery](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimplePlayerQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-), [filter](../../../simple/hooks/queries/SimplePlayerQuery.html#filter-java.lang.String...-), [filter](../../../simple/hooks/queries/SimplePlayerQuery.html#filter-simple.robot.utils.WorldArea-), [filter](../../../simple/hooks/queries/SimplePlayerQuery.html#filter-net.runelite.api.coords.WorldPoint...-), [filterHasAction](../../../simple/hooks/queries/SimplePlayerQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimplePlayerQuery.html#filterHasAction-java.lang.String...-), [filterWithin](../../../simple/hooks/queries/SimplePlayerQuery.html#filterWithin-int-), [filterWithin](../../../simple/hooks/queries/SimplePlayerQuery.html#filterWithin-net.runelite.api.coords.WorldPoint-int-), [nearest](../../../simple/hooks/queries/SimplePlayerQuery.html#nearest--), [nearest](../../../simple/hooks/queries/SimplePlayerQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-), [nearest](../../../simple/hooks/queries/SimplePlayerQuery.html#nearest-net.runelite.api.coords.WorldPoint-), [nextNearest](../../../simple/hooks/queries/SimplePlayerQuery.html#nextNearest--)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### SimplePlayers
            
            public SimplePlayers([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### getLocal
            
            public [SimpleLocalPlayer](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers") getLocal()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePlayers.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleObjects.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePrayers.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimplePlayers.html)
*   [No Frames](SimplePlayers.html)

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