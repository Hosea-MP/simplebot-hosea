SimpleObjects   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleObjects"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleObjects.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePlayers.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleObjects.html)
*   [No Frames](SimpleObjects.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.filters

Class SimpleObjects
-------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimpleObjects

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimpleObjects
    extends [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")<[SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static java.util.Set<java.lang.Integer>`
        
        `[ignoreSet](../../../simple/hooks/filters/SimpleObjects.html#ignoreSet)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleObjects](../../../simple/hooks/filters/SimpleObjects.html#SimpleObjects-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `java.util.List<net.runelite.api.GraphicsObject>`
        
        `[getGraphicsObjects](../../../simple/hooks/filters/SimpleObjects.html#getGraphicsObjects--)()`
        
        Object Gathering methods
        
        `boolean`
        
        `[isImposter](../../../simple/hooks/filters/SimpleObjects.html#isImposter-int-)(int id)` 
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-int...-), [filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.hooks.interfaces.SimpleLocatable...-), [filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-java.lang.String...-), [filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-simple.robot.utils.WorldArea-), [filter](../../../simple/hooks/queries/SimpleEntityQuery.html#filter-net.runelite.api.coords.WorldPoint...-), [filterHasAction](../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimpleEntityQuery.html#filterHasAction-java.lang.String...-), [filterWithin](../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-int-), [filterWithin](../../../simple/hooks/queries/SimpleEntityQuery.html#filterWithin-net.runelite.api.coords.WorldPoint-int-), [nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest--), [nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-simple.hooks.interfaces.SimpleLocatable-), [nearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nearest-net.runelite.api.coords.WorldPoint-), [nextNearest](../../../simple/hooks/queries/SimpleEntityQuery.html#nextNearest--)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Field Detail
        
        *   #### ignoreSet
            
            public static java.util.Set<java.lang.Integer> ignoreSet
            
    
    *   ### Constructor Detail
        
        *   #### SimpleObjects
            
            public SimpleObjects([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### getGraphicsObjects
            
            public java.util.List<net.runelite.api.GraphicsObject> getGraphicsObjects()
            
            Object Gathering methods
            
        
        *   #### isImposter
            
            public boolean isImposter(int id)
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleObjects.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleNpcs.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePlayers.html "class in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleObjects.html)
*   [No Frames](SimpleObjects.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)