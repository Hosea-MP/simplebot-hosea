Magic.SpellBook   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Magic.SpellBook"; } } catch(err) { } //--> var methods = {"i0":9,"i1":9}; var tabs = {65535:\["t0","All Methods"\],1:\["t1","Static Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Magic.SpellBook.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Magic.MagicSpell.html "interface in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Magic.SpellBook.html)
*   [No Frames](Magic.SpellBook.html)

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

simple.hooks.simplebot

Enum Magic.SpellBook
--------------------

*   java.lang.Object
*   *   java.lang.Enum<[Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")\>
    *   *   simple.hooks.simplebot.Magic.SpellBook

*   All Implemented Interfaces:
    
    java.io.Serializable, java.lang.Comparable<[Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")\>
    
    Enclosing class:
    
    [Magic](../../../simple/hooks/simplebot/Magic.html "class in simple.hooks.simplebot")
    
    * * *
    
      
    
    public static enum Magic.SpellBook
    extends java.lang.Enum<[Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")\>
    

*   *   ### Enum Constant Summary
        
        Enum Constants 
        
        Enum Constant and Description
        
        `[ANCIENT](../../../simple/hooks/simplebot/Magic.SpellBook.html#ANCIENT)`
        
        Wraps all the spells in the Ancient spell book.
        
        `[ARCEUUS](../../../simple/hooks/simplebot/Magic.SpellBook.html#ARCEUUS)`
        
        Wraps all the spells in the Arceuus spell book.
        
        `[LUNAR](../../../simple/hooks/simplebot/Magic.SpellBook.html#LUNAR)`
        
        Wraps all the spells in the Lunar spell book.
        
        `[MODERN](../../../simple/hooks/simplebot/Magic.SpellBook.html#MODERN)`
        
        Wraps all the spells in the Modern spell book.
        
    
    *   ### Method Summary
        
        All Methods [Static Methods](javascript:show\(1\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `static [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")`
        
        `[valueOf](../../../simple/hooks/simplebot/Magic.SpellBook.html#valueOf-java.lang.String-)(java.lang.String name)`
        
        Returns the enum constant of this type with the specified name.
        
        `static [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")[]`
        
        `[values](../../../simple/hooks/simplebot/Magic.SpellBook.html#values--)()`
        
        Returns an array containing the constants of this enum type, in the order they are declared.
        
        *   ### Methods inherited from class java.lang.Enum
            
            `compareTo, equals, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
        
        *   ### Methods inherited from class java.lang.Object
            
            `getClass, notify, notifyAll, wait, wait, wait`

*   *   ### Enum Constant Detail
        
        *   #### MODERN
            
            public static final [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") MODERN
            
            Wraps all the spells in the Modern spell book.
            
        
        *   #### ANCIENT
            
            public static final [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") ANCIENT
            
            Wraps all the spells in the Ancient spell book.
            
        
        *   #### LUNAR
            
            public static final [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") LUNAR
            
            Wraps all the spells in the Lunar spell book.
            
        
        *   #### ARCEUUS
            
            public static final [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") ARCEUUS
            
            Wraps all the spells in the Arceuus spell book.
            
    
    *   ### Method Detail
        
        *   #### values
            
            public static [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")\[\] values()
            
            Returns an array containing the constants of this enum type, in the order they are declared. This method may be used to iterate over the constants as follows:
            
            for (Magic.SpellBook c : Magic.SpellBook.values())
                System.out.println(c);
            
            Returns:
            
            an array containing the constants of this enum type, in the order they are declared
            
        
        *   #### valueOf
            
            public static [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") valueOf(java.lang.String name)
            
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
*   [Use](class-use/Magic.SpellBook.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Magic.MagicSpell.html "interface in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Paintable.html "interface in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Magic.SpellBook.html)
*   [No Frames](Magic.SpellBook.html)

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