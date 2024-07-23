SimpleItem.ItemType   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleItem.ItemType"; } } catch(err) { } //--> var methods = {"i0":9,"i1":9}; var tabs = {65535:\["t0","All Methods"\],1:\["t1","Static Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItem.ItemType.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleItem.ItemType.html)
*   [No Frames](SimpleItem.ItemType.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Enum Constants](#enum.constant.summary) | 
*   Field | 
*   [Method](#method.summary)

*   Detail: 
*   [Enum Constants](#enum.constant.detail) | 
*   Field | 
*   [Method](#method.detail)

simple.hooks.wrappers

Enum SimpleItem.ItemType
------------------------

*   java.lang.Object
*   *   java.lang.Enum<[SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")\>
    *   *   simple.hooks.wrappers.SimpleItem.ItemType

*   All Implemented Interfaces:
    
    java.io.Serializable, java.lang.Comparable<[SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")\>
    
    Enclosing class:
    
    [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")
    
    * * *
    
      
    
    public static enum SimpleItem.ItemType
    extends java.lang.Enum<[SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")\>
    

*   *   ### Enum Constant Summary
        
        Enum Constants 
        
        Enum Constant and Description
        
        `[BANK_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#BANK_ITEM)` 
        
        `[EQUIPMENT_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#EQUIPMENT_ITEM)` 
        
        `[INVENTORY_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#INVENTORY_ITEM)` 
        
        `[SHOP_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#SHOP_ITEM)` 
        
        `[TRADE_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#TRADE_ITEM)` 
        
        `[WIDGET_ITEM](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#WIDGET_ITEM)` 
        
    
    *   ### Method Summary
        
        All Methods [Static Methods](javascript:show\(1\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `static [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")`
        
        `[valueOf](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#valueOf-java.lang.String-)(java.lang.String name)`
        
        Returns the enum constant of this type with the specified name.
        
        `static [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")[]`
        
        `[values](../../../simple/hooks/wrappers/SimpleItem.ItemType.html#values--)()`
        
        Returns an array containing the constants of this enum type, in the order they are declared.
        
        *   ### Methods inherited from class java.lang.Enum
            
            `compareTo, equals, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
        
        *   ### Methods inherited from class java.lang.Object
            
            `getClass, notify, notifyAll, wait, wait, wait`

*   *   ### Enum Constant Detail
        
        *   #### INVENTORY\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") INVENTORY\_ITEM
            
        
        *   #### EQUIPMENT\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") EQUIPMENT\_ITEM
            
        
        *   #### BANK\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") BANK\_ITEM
            
        
        *   #### SHOP\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") SHOP\_ITEM
            
        
        *   #### TRADE\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") TRADE\_ITEM
            
        
        *   #### WIDGET\_ITEM
            
            public static final [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") WIDGET\_ITEM
            
    
    *   ### Method Detail
        
        *   #### values
            
            public static [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")\[\] values()
            
            Returns an array containing the constants of this enum type, in the order they are declared. This method may be used to iterate over the constants as follows:
            
            for (SimpleItem.ItemType c : SimpleItem.ItemType.values())
                System.out.println(c);
            
            Returns:
            
            an array containing the constants of this enum type, in the order they are declared
            
        
        *   #### valueOf
            
            public static [SimpleItem.ItemType](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers") valueOf(java.lang.String name)
            
            Returns the enum constant of this type with the specified name. The string must match _exactly_ an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.)
            
            Parameters:
            
            `name` - the name of the enum constant to be returned.
            
            Returns:
            
            the enum constant with the specified name
            
            Throws:
            
            `java.lang.IllegalArgumentException` - if this enum type has no constant with the specified name
            
            `java.lang.NullPointerException` - if the argument is null
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleItem.ItemType.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleItem.ItemType.html)
*   [No Frames](SimpleItem.ItemType.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Enum Constants](#enum.constant.summary) | 
*   Field | 
*   [Method](#method.summary)

*   Detail: 
*   [Enum Constants](#enum.constant.detail) | 
*   Field | 
*   [Method](#method.detail)