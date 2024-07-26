SimplePair   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimplePair"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePair.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/ScriptUtils.html "class in simple.robot.utils")
*   [Next Class](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")

*   [Frames](../../../index.html?simple/robot/utils/SimplePair.html)
*   [No Frames](SimplePair.html)

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

simple.robot.utils

Class SimplePair<K,V>
---------------------

*   java.lang.Object
*   *   simple.robot.utils.SimplePair<K,V>

*   All Implemented Interfaces:
    
    java.io.Serializable
    
    * * *
    
      
    
    public class SimplePair<K,V>
    extends java.lang.Object
    implements java.io.Serializable
    
    A convenience class to represent name-value pairs.
    
    See Also:
    
    [Serialized Form](../../../serialized-form.html#simple.robot.utils.SimplePair)
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimplePair](../../../simple/robot/utils/SimplePair.html#SimplePair-K-V-)([K](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") key, [V](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") value)`
        
        Creates a new pair
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[equals](../../../simple/robot/utils/SimplePair.html#equals-java.lang.Object-)(java.lang.Object o)`
        
        Test this `Pair` for equality with another `Object`.
        
        `[K](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair")`
        
        `[getKey](../../../simple/robot/utils/SimplePair.html#getKey--)()`
        
        Gets the key for this pair.
        
        `[V](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair")`
        
        `[getValue](../../../simple/robot/utils/SimplePair.html#getValue--)()`
        
        Gets the value for this pair.
        
        `int`
        
        `[hashCode](../../../simple/robot/utils/SimplePair.html#hashCode--)()`
        
        Generate a hash code for this `Pair`.
        
        `java.lang.String`
        
        `[toString](../../../simple/robot/utils/SimplePair.html#toString--)()`
        
        `String` representation of this `Pair`.
        
        *   ### Methods inherited from class java.lang.Object
            
            `getClass, notify, notifyAll, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### SimplePair
            
            public SimplePair([K](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") key,
                              [V](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") value)
            
            Creates a new pair
            
            Parameters:
            
            `key` - The key for this pair
            
            `value` - The value to use for this pair
            
    
    *   ### Method Detail
        
        *   #### getKey
            
            public [K](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") getKey()
            
            Gets the key for this pair.
            
            Returns:
            
            key for this pair
            
        
        *   #### getValue
            
            public [V](../../../simple/robot/utils/SimplePair.html "type parameter in SimplePair") getValue()
            
            Gets the value for this pair.
            
            Returns:
            
            value for this pair
            
        
        *   #### toString
            
            public java.lang.String toString()
            
            `String` representation of this `Pair`.
            
            The default name/value delimiter '=' is always used.
            
            Overrides:
            
            `toString` in class `java.lang.Object`
            
            Returns:
            
            `String` representation of this `Pair`
            
        
        *   #### hashCode
            
            public int hashCode()
            
            Generate a hash code for this `Pair`.
            
            The hash code is calculated using both the name and the value of the `Pair`.
            
            Overrides:
            
            `hashCode` in class `java.lang.Object`
            
            Returns:
            
            hash code for this `Pair`
            
        
        *   #### equals
            
            public boolean equals(java.lang.Object o)
            
            Test this `Pair` for equality with another `Object`.
            
            If the `Object` to be tested is not a `Pair` or is `null`, then this method returns `false`.
            
            Two `Pair`s are considered equal if and only if both the names and values are equal.
            
            Overrides:
            
            `equals` in class `java.lang.Object`
            
            Parameters:
            
            `o` - the `Object` to rScripts.allInOne for equality with this `Pair`
            
            Returns:
            
            `true` if the given `Object` is equal to this `Pair` else `false`
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePair.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/ScriptUtils.html "class in simple.robot.utils")
*   [Next Class](../../../simple/robot/utils/WorldArea.html "class in simple.robot.utils")

*   [Frames](../../../index.html?simple/robot/utils/SimplePair.html)
*   [No Frames](SimplePair.html)

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