SimpleQuery   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleQuery"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleQuery.html)
*   [No Frames](SimpleQuery.html)

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

Class SimpleQuery<T extends SimpleQuery<T,K>,K>
-----------------------------------------------

*   java.lang.Object
*   *   simple.hooks.queries.SimpleQuery<T,K>

*   All Implemented Interfaces:
    
    java.lang.Iterable<K>
    
    Direct Known Subclasses:
    
    [SimpleEntityQuery](../../../simple/hooks/queries/SimpleEntityQuery.html "class in simple.hooks.queries"), [SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries"), [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries"), [SimplePlayerQuery](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries"), [SimpleTextQuery](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")
    
    * * *
    
      
    
    public abstract class SimpleQuery<T extends SimpleQuery<T,K>,K>
    extends java.lang.Object
    implements java.lang.Iterable<K>
    
    Created by Seth on Nov 18, 2019 at 9:47:12 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-)([K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") item)`
        
        Checks if the query contains the specified item
        
        `[T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-)(java.util.function.Predicate<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")> condition)`
        
        Will filter out all items that do not pass the specified predicate condition
        
        `boolean`
        
        `[isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--)()`
        
        Will return if the query is empty
        
        `java.util.Iterator<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")>`
        
        `[iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--)()` 
        
        `[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[next](../../../simple/hooks/queries/SimpleQuery.html#next--)()`
        
        Returns the next item in the query whilst removing it from the query
        
        `[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--)()`
        
        Returns the next item in the query without popping it from the query
        
        `[T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[populate](../../../simple/hooks/queries/SimpleQuery.html#populate--)()`
        
        Will clear the current query and populate it with newly grabbed items
        
        `int`
        
        `[population](../../../simple/hooks/queries/SimpleQuery.html#population--)()`
        
        Will return the amount of items inside of the query
        
        `[T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--)()`
        
        Will reverse the order of the items in the query making the first item the last and so on
        
        `[T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--)()`
        
        Will shuffle the order of the items in the query randomly
        
        `int`
        
        `[size](../../../simple/hooks/queries/SimpleQuery.html#size--)()`
        
        Will return the amount of items inside of the query
        
        `[T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")`
        
        `[sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-)(java.util.Comparator<? super [K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")> comparator)`
        
        Will sort the query by the specified comparator
        
        `java.util.stream.Stream<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")>`
        
        `[toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)()`
        
        Will return a stream of the current query
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Method Detail
        
        *   #### toStream
            
            public final java.util.stream.Stream<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")\> toStream()
            
            Will return a stream of the current query
            
            Returns:
            
            returns a Stream representing the current query
            
        
        *   #### populate
            
            public [T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") populate()
            
            Will clear the current query and populate it with newly grabbed items
            
            Returns:
            
            returns a new query of fresh items
            
        
        *   #### population
            
            public int population()
            
            Will return the amount of items inside of the query
            
            Returns:
            
            returns the current size of the query
            
        
        *   #### isEmpty
            
            public boolean isEmpty()
            
            Will return if the query is empty
            
            Returns:
            
            returns {true} if the query is empty, {false} otherwise
            
        
        *   #### next
            
            public [K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") next()
            
            Returns the next item in the query whilst removing it from the query
            
            Returns:
            
            the next item in the query, if the query is empty will return: null
            
        
        *   #### peekNext
            
            public [K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") peekNext()
            
            Returns the next item in the query without popping it from the query
            
            Returns:
            
            the next item in the query, if the query is empty will return: null
            
        
        *   #### filter
            
            public [T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") filter(java.util.function.Predicate<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")\> condition)
            
            Will filter out all items that do not pass the specified predicate condition
            
            Parameters:
            
            `condition` - the condition to filter the query by
            
            Returns:
            
            returns items in the query that have passed the predicate
            
        
        *   #### sort
            
            public [T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") sort(java.util.Comparator<? super [K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")\> comparator)
            
            Will sort the query by the specified comparator
            
            Parameters:
            
            `comparator` - the comparator to sort the query by
            
            Returns:
            
            returns the query sorted by said comparator
            
        
        *   #### shuffle
            
            public [T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") shuffle()
            
            Will shuffle the order of the items in the query randomly
            
            Returns:
            
            returns the randomly shuffled query
            
        
        *   #### reverse
            
            public [T](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") reverse()
            
            Will reverse the order of the items in the query making the first item the last and so on
            
            Returns:
            
            returns the query in reverse order
            
        
        *   #### iterator
            
            public java.util.Iterator<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")\> iterator()
            
            Specified by:
            
            `iterator` in interface `java.lang.Iterable<[K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery")>`
            
        
        *   #### contains
            
            public boolean contains([K](../../../simple/hooks/queries/SimpleQuery.html "type parameter in SimpleQuery") item)
            
            Checks if the query contains the specified item
            
            Parameters:
            
            `item` - object to check if the query contains
            
            Returns:
            
            returns if the query contains the item {true}, otherwise {false}
            
        
        *   #### size
            
            public int size()
            
            Will return the amount of items inside of the query
            
            Returns:
            
            returns the current size of the query
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleQuery.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/queries/SimplePlayerQuery.html "class in simple.hooks.queries")
*   [Next Class](../../../simple/hooks/queries/SimpleTextQuery.html "class in simple.hooks.queries")

*   [Frames](../../../index.html?simple/hooks/queries/SimpleQuery.html)
*   [No Frames](SimpleQuery.html)

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