Magic   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Magic"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Magic.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Keyboard.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Magic.MagicSpell.html "interface in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Magic.html)
*   [No Frames](Magic.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.simplebot

Class Magic
-----------

*   java.lang.Object
*   *   simple.hooks.simplebot.Magic

*   * * *
    
      
    
    public class Magic
    extends java.lang.Object
    
    Created by Seth on Nov 11, 2019 at 6:42:53 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static interface` 
        
        `[Magic.MagicSpell](../../../simple/hooks/simplebot/Magic.MagicSpell.html "interface in simple.hooks.simplebot")` 
        
        `static class` 
        
        `[Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Magic](../../../simple/hooks/simplebot/Magic.html#Magic-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[castHomeTeleport](../../../simple/hooks/simplebot/Magic.html#castHomeTeleport--)()`
        
        Will cast the home teleport spell on any spell book
        
        `boolean`
        
        `[castSpellOnce](../../../simple/hooks/simplebot/Magic.html#castSpellOnce-java.lang.String-)(java.lang.String spellName)`
        
        returns {true} if cast was successful, {false} otherwise
        
        `boolean`
        
        `[castSpellOnItem](../../../simple/hooks/simplebot/Magic.html#castSpellOnItem-java.lang.String-int-)(java.lang.String spellName, int itemId)`
        
        will cast {spellname} on specified item with id={id} in your inventory, returns {true} if cast was successful, {false} otherwise
        
        `boolean`
        
        `[castSpellOnNPC](../../../simple/hooks/simplebot/Magic.html#castSpellOnNPC-java.lang.String-simple.hooks.wrappers.SimpleNpc-)(java.lang.String spellName, [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers") npc)`
        
        will cast {spellname} on specified {npc}, returns {true} if cast was successful, {false} otherwise
        
        `boolean`
        
        `[castSpellOnPlayer](../../../simple/hooks/simplebot/Magic.html#castSpellOnPlayer-java.lang.String-simple.hooks.wrappers.SimplePlayer-)(java.lang.String spellName, [SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers") player)`
        
        will cast {spellname} on specified {player}, returns {true} if cast was successful, {false} otherwise
        
        `[Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot")`
        
        `[spellBook](../../../simple/hooks/simplebot/Magic.html#spellBook--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Magic
            
            public Magic([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### castSpellOnNPC
            
            public boolean castSpellOnNPC(java.lang.String spellName,
                                          [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers") npc)
            
            will cast {spellname} on specified {npc}, returns {true} if cast was successful, {false} otherwise
            
            Parameters:
            
            `spellName` -
            
            `npc` -
            
            Returns:
            
        
        *   #### castSpellOnPlayer
            
            public boolean castSpellOnPlayer(java.lang.String spellName,
                                             [SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers") player)
            
            will cast {spellname} on specified {player}, returns {true} if cast was successful, {false} otherwise
            
            Parameters:
            
            `spellName` -
            
            `player` -
            
            Returns:
            
        
        *   #### castSpellOnce
            
            public boolean castSpellOnce(java.lang.String spellName)
            
            returns {true} if cast was successful, {false} otherwise
            
            Parameters:
            
            `spellName` -
            
            Returns:
            
        
        *   #### castSpellOnItem
            
            public boolean castSpellOnItem(java.lang.String spellName,
                                           int itemId)
            
            will cast {spellname} on specified item with id={id} in your inventory, returns {true} if cast was successful, {false} otherwise
            
            Parameters:
            
            `spellName` -
            
            `itemId` -
            
            Returns:
            
        
        *   #### castHomeTeleport
            
            public boolean castHomeTeleport()
            
            Will cast the home teleport spell on any spell book
            
            Returns:
            
            if the spell was casted or not
            
        
        *   #### spellBook
            
            public [Magic.SpellBook](../../../simple/hooks/simplebot/Magic.SpellBook.html "enum in simple.hooks.simplebot") spellBook()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Magic.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Keyboard.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Magic.MagicSpell.html "interface in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Magic.html)
*   [No Frames](Magic.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)