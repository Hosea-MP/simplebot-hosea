SimpleIdQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleIdQuery"; } } catch(err) { } //--> var methods = {"i0":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleIdQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleIdQuery.html)
*   [No Frames](SimpleIdQuery.html)

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

Class SimpleIdQuery<K extends [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")\>
-----------------------------------------------------------------------------------------------------------------------------------------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   simple.hooks.queries.SimpleIdQuery<K>

*   All Implemented Interfaces:
    
    java.lang.Iterable<K>
    
    Direct Known Subclasses:
    
    [Projectiles](../../../simple/hooks/simplebot/Projectiles.html "class in simple.hooks.simplebot")
    
    * * *
    
      
    
    public abstract class SimpleIdQuery<K extends [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")\>
    extends [SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<K>,K>
    
    Created by Seth on Jan 8, 2021 at 4:00:36 PM
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleIdQuery.html "type parameter in SimpleIdQuery")>`
        
        `[filter](../../../simple/hooks/queries/SimpleIdQuery.html#filter-int...-)(int... ids)`
        
        Will filter out all projectiles whose id isn't one of the elements inside of the {ids} array
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Method Detail
        
        *   #### filter
            
            public [SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleIdQuery.html "type parameter in SimpleIdQuery")\> filter(int... ids)
            
            Will filter out all projectiles whose id isn't one of the elements inside of the {ids} array
            
            Parameters:
            
            `ids` - array of ids for our filter
            
            Returns:
            
            returns the query of only projectiles whose id's match one of those inside of {ids}
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleIdQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleIdQuery.html)
*   [No Frames](SimpleIdQuery.html)

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