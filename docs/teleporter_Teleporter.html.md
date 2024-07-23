Teleporter   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Teleporter"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Teleporter.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html "class in simple.hooks.simplebot.teleporter")

*   [Frames](../../../../index.html?simple/hooks/simplebot/teleporter/Teleporter.html)
*   [No Frames](Teleporter.html)

*   [All Classes](../../../../allclasses-noframe.html)

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

simple.hooks.simplebot.teleporter

Class Teleporter
----------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleTextQuery](../../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleTextQuery](../../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[TeleporterOption](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html "class in simple.hooks.simplebot.teleporter")\>
        *   *   simple.hooks.simplebot.teleporter.Teleporter

*   All Implemented Interfaces:
    
    java.lang.Iterable<[TeleporterOption](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html "class in simple.hooks.simplebot.teleporter")\>
    
    * * *
    
      
    
    public class Teleporter
    extends [SimpleTextQuery](../../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[TeleporterOption](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html "class in simple.hooks.simplebot.teleporter")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Teleporter](../../../../simple/hooks/simplebot/teleporter/Teleporter.html#Teleporter-simple.robot.api.ClientContext-)([ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[open](../../../../simple/hooks/simplebot/teleporter/Teleporter.html#open--)()` 
        
        `boolean`
        
        `[open](../../../../simple/hooks/simplebot/teleporter/Teleporter.html#open-int-)(int option)` 
        
        `boolean`
        
        `[opened](../../../../simple/hooks/simplebot/teleporter/Teleporter.html#opened--)()` 
        
        `boolean`
        
        `[teleportStringPath](../../../../simple/hooks/simplebot/teleporter/Teleporter.html#teleportStringPath-java.lang.String-java.lang.String-)(java.lang.String category, java.lang.String teleportName)` 
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleTextQuery](../../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")
            
            `[filterContains](../../../../simple/hooks/queries/SimpleTextQuery.html#filterContains-java.lang.String...-), [filterExact](../../../../simple/hooks/queries/SimpleTextQuery.html#filterExact-java.lang.String...-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### Teleporter
            
            public Teleporter([ClientContext](../../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### open
            
            public boolean open()
            
        
        *   #### open
            
            public boolean open(int option)
            
        
        *   #### opened
            
            public boolean opened()
            
        
        *   #### teleportStringPath
            
            public boolean teleportStringPath(java.lang.String category,
                                              java.lang.String teleportName)
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Teleporter.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html "class in simple.hooks.simplebot.teleporter")

*   [Frames](../../../../index.html?simple/hooks/simplebot/teleporter/Teleporter.html)
*   [No Frames](Teleporter.html)

*   [All Classes](../../../../allclasses-noframe.html)

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