Combat   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Combat"; } } catch(err) { } //--> var methods = {"i0":42,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":42,"i15":10,"i16":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Combat.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/ClientUser.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Combat.html)
*   [No Frames](Combat.html)

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

Class Combat
------------

*   java.lang.Object
*   *   simple.hooks.simplebot.Combat

*   * * *
    
      
    
    public class Combat
    extends java.lang.Object
    
    Created by Seth on Sep 29, 2019 at 1:09:12 AM.
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[Combat.Style](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot")`
        
        An enum of the possible Combat Style to switch to {Style.ACCURATE, Style.AGGRESSIVE, Style.CONTROLLED, Style.DEFENSIVE}
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Combat](../../../simple/hooks/simplebot/Combat.html#Combat-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int`
        
        `[attackStyle](../../../simple/hooks/simplebot/Combat.html#attackStyle--)()`
        
        Deprecated. 
        
        `boolean`
        
        `[autoRetaliate](../../../simple/hooks/simplebot/Combat.html#autoRetaliate--)()` 
        
        `int`
        
        `[getSpecialAttackPercentage](../../../simple/hooks/simplebot/Combat.html#getSpecialAttackPercentage--)()`
        
        will return your special attack as a percentage out of 100
        
        `int`
        
        `[health](../../../simple/hooks/simplebot/Combat.html#health--)()`
        
        will return your current health
        
        `int`
        
        `[healthPercent](../../../simple/hooks/simplebot/Combat.html#healthPercent--)()`
        
        will return your current health based on a percentage out of {100}
        
        `boolean`
        
        `[inCombat](../../../simple/hooks/simplebot/Combat.html#inCombat--)()`
        
        will return if an {NPC} is currently attacking you nor not, and not the other way around
        
        `boolean`
        
        `[inMultiCombat](../../../simple/hooks/simplebot/Combat.html#inMultiCombat--)()`
        
        will return if you are in a multi-combat area or not, {true} = in multi, {false} = not in multi
        
        `boolean`
        
        `[isPoisoned](../../../simple/hooks/simplebot/Combat.html#isPoisoned--)()`
        
        will return if you are currently poisoned or not, {true} = yes, {false} = no
        
        `boolean`
        
        `[isPoisonImmune](../../../simple/hooks/simplebot/Combat.html#isPoisonImmune--)()`
        
        will return if you are currently immune to poison or venom, {true} = immume, {false} = not immune
        
        `boolean`
        
        `[isVenomed](../../../simple/hooks/simplebot/Combat.html#isVenomed--)()`
        
        will return if you are currently venomed or not, {true} = yes, {false} = no
        
        `int`
        
        `[maxHealth](../../../simple/hooks/simplebot/Combat.html#maxHealth--)()`
        
        will return your max health based on your level
        
        `boolean`
        
        `[specialAttack](../../../simple/hooks/simplebot/Combat.html#specialAttack--)()`
        
        will return if your special attack is toggled on or off, {true} = on, {false} = off
        
        `[Combat.Style](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot")`
        
        `[style](../../../simple/hooks/simplebot/Combat.html#style--)()`
        
        will return your current combat style
        
        `boolean`
        
        `[style](../../../simple/hooks/simplebot/Combat.html#style-simple.hooks.simplebot.Combat.Style-)([Combat.Style](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot") style)`
        
        will switch your combat style to the specified {style}: {Style.ACCURATE, Style.AGGRESSIVE, Style.CONTROLLED, Style.DEFENSIVE}
        
        `boolean`
        
        `[switchAttackStyles](../../../simple/hooks/simplebot/Combat.html#switchAttackStyles-int-)(int style)`
        
        Deprecated. 
        
        `boolean`
        
        `[toggleAutoRetaliate](../../../simple/hooks/simplebot/Combat.html#toggleAutoRetaliate-boolean-)(boolean enable)`
        
        Will toggle auto retaliate to the specified toggle of {enable}
        
        `boolean`
        
        `[toggleSpecialAttack](../../../simple/hooks/simplebot/Combat.html#toggleSpecialAttack-boolean-)(boolean enable)`
        
        will toggle special attack to the specified toggle of {enable}
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Combat
            
            public Combat([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### switchAttackStyles
            
            @Deprecated
            public boolean switchAttackStyles(int style)
            
            Deprecated. 
            
            METHOD IS DEPRECATED DO NOT USE!
            
        
        *   #### toggleAutoRetaliate
            
            public boolean toggleAutoRetaliate(boolean enable)
            
            Will toggle auto retaliate to the specified toggle of {enable}
            
            Parameters:
            
            `enable` -
            
            Returns:
            
            \- if auto retaliate state =={enable}
            
        
        *   #### autoRetaliate
            
            public boolean autoRetaliate()
            
            Returns:
            
            \- will return if auto retaliate is either on or off, {true} = on, {false} = off
            
        
        *   #### toggleSpecialAttack
            
            public boolean toggleSpecialAttack(boolean enable)
            
            will toggle special attack to the specified toggle of {enable}
            
            Parameters:
            
            `enable` -
            
            Returns:
            
        
        *   #### getSpecialAttackPercentage
            
            public int getSpecialAttackPercentage()
            
            will return your special attack as a percentage out of 100
            
            Returns:
            
        
        *   #### specialAttack
            
            public boolean specialAttack()
            
            will return if your special attack is toggled on or off, {true} = on, {false} = off
            
            Returns:
            
        
        *   #### attackStyle
            
            @Deprecated
            public int attackStyle()
            
            Deprecated. 
            
            DEPRECATED DO NOT USE THIS METHOD!
            
        
        *   #### inMultiCombat
            
            public boolean inMultiCombat()
            
            will return if you are in a multi-combat area or not, {true} = in multi, {false} = not in multi
            
            Returns:
            
        
        *   #### isPoisonImmune
            
            public boolean isPoisonImmune()
            
            will return if you are currently immune to poison or venom, {true} = immume, {false} = not immune
            
            Returns:
            
        
        *   #### isVenomed
            
            public boolean isVenomed()
            
            will return if you are currently venomed or not, {true} = yes, {false} = no
            
            Returns:
            
        
        *   #### isPoisoned
            
            public boolean isPoisoned()
            
            will return if you are currently poisoned or not, {true} = yes, {false} = no
            
            Returns:
            
        
        *   #### health
            
            public int health()
            
            will return your current health
            
            Returns:
            
        
        *   #### maxHealth
            
            public int maxHealth()
            
            will return your max health based on your level
            
            Returns:
            
        
        *   #### healthPercent
            
            public int healthPercent()
            
            will return your current health based on a percentage out of {100}
            
            Returns:
            
        
        *   #### inCombat
            
            public boolean inCombat()
            
            will return if an {NPC} is currently attacking you nor not, and not the other way around
            
            Returns:
            
        
        *   #### style
            
            public [Combat.Style](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot") style()
            
            will return your current combat style
            
            Returns:
            
        
        *   #### style
            
            public boolean style([Combat.Style](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot") style)
            
            will switch your combat style to the specified {style}: {Style.ACCURATE, Style.AGGRESSIVE, Style.CONTROLLED, Style.DEFENSIVE}
            
            Parameters:
            
            `style` -
            
            Returns:
            
            \- returns {true} if {style} has been successfully set, {false} if not
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Combat.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/ClientUser.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Combat.Style.html "enum in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Combat.html)
*   [No Frames](Combat.html)

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