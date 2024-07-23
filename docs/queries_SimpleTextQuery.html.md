SimpleTextQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleTextQuery"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleTextQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/queries/SimpleTextQuery.html)
*   [No Frames](SimpleTextQuery.html)

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

Class SimpleTextQuery<K extends [SimpleText](../../../simple/hooks/interfaces/SimpleText.html "interface in simple.hooks.interfaces")\>
---------------------------------------------------------------------------------------------------------------------------------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   simple.hooks.queries.SimpleTextQuery<K>

*   All Implemented Interfaces:
    
    java.lang.Iterable<K>
    
    Direct Known Subclasses:
    
    [Dialogue](../../../simple/hooks/simplebot/Dialogue.html "class in simple.hooks.simplebot"), [Teleporter](../../../simple/hooks/simplebot/teleporter/Teleporter.html "class in simple.hooks.simplebot.teleporter")
    
    * * *
    
      
    
    public abstract class SimpleTextQuery<K extends [SimpleText](../../../simple/hooks/interfaces/SimpleText.html "interface in simple.hooks.interfaces")\>
    extends [SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<K>,K>
    
    Created by Seth on December 12/18/2019, 2019 at 1:17 AM
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleTextQuery.html "type parameter in SimpleTextQuery")>`
        
        `[filterContains](../../../simple/hooks/queries/SimpleTextQuery.html#filterContains-java.lang.String...-)(java.lang.String... texts)`
        
        Will filter out all items whose text does not contain any of the given strings in {texts}.
        
        `[SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleTextQuery.html "type parameter in SimpleTextQuery")>`
        
        `[filterExact](../../../simple/hooks/queries/SimpleTextQuery.html#filterExact-java.lang.String...-)(java.lang.String... texts)`
        
        Will filter out all items whose text does not exactly match any of the given strings in {texts}.
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Method Detail
        
        *   #### filterExact
            
            public [SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleTextQuery.html "type parameter in SimpleTextQuery")\> filterExact(java.lang.String... texts)
            
            Will filter out all items whose text does not exactly match any of the given strings in {texts}. Method will {toLowercase()} everything for you whilst checking.
            
            Parameters:
            
            `texts` - Strings to check the items in our query against
            
            Returns:
            
            returns items whose text match one of the given strings
            
        
        *   #### filterContains
            
            public [SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")<[K](../../../simple/hooks/queries/SimpleTextQuery.html "type parameter in SimpleTextQuery")\> filterContains(java.lang.String... texts)
            
            Will filter out all items whose text does not contain any of the given strings in {texts}. Method will {toLowercase()} everything for you whilst checking.
            
            Parameters:
            
            `texts` - Strings to check the items in our query against
            
            Returns:
            
            returns items whose text contain one of the given strings inside of them
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleTextQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/queries/SimpleTextQuery.html)
*   [No Frames](SimpleTextQuery.html)

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