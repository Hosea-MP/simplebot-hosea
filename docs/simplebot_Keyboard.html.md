Keyboard   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Keyboard"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Keyboard.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Magic.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Keyboard.html)
*   [No Frames](Keyboard.html)

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

simple.hooks.simplebot

Class Keyboard
--------------

*   java.lang.Object
*   *   simple.hooks.simplebot.Keyboard

*   All Implemented Interfaces:
    
    java.awt.event.KeyListener, java.util.EventListener
    
    * * *
    
      
    
    public class Keyboard
    extends java.lang.Object
    implements java.awt.event.KeyListener
    
    Virtual keyboard, dispatches key events to a component.
    
    Author:
    
    Everel, Matt, Dane
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static int`
        
        `[ENTER_KEYCODE](../../../simple/hooks/simplebot/Keyboard.html#ENTER_KEYCODE)`
        
        `KeyEvent.VK_ENTER` is actually New Line, '\\n'.
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Keyboard](../../../simple/hooks/simplebot/Keyboard.html#Keyboard-net.runelite.api.Client-)(net.runelite.api.Client client)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `void`
        
        `[clickKey](../../../simple/hooks/simplebot/Keyboard.html#clickKey-char-)(char c)`
        
        Creates and sends a single KeyEvent using the given Char.
        
        `void`
        
        `[clickKey](../../../simple/hooks/simplebot/Keyboard.html#clickKey-int-)(int keyCode)`
        
        Creates and sends a given KeyEvent using the given keyCode.
        
        `java.awt.Component`
        
        `[getComponent](../../../simple/hooks/simplebot/Keyboard.html#getComponent--)()` 
        
        `void`
        
        `[keyPressed](../../../simple/hooks/simplebot/Keyboard.html#keyPressed-java.awt.event.KeyEvent-)(java.awt.event.KeyEvent e)` 
        
        `void`
        
        `[keyReleased](../../../simple/hooks/simplebot/Keyboard.html#keyReleased-java.awt.event.KeyEvent-)(java.awt.event.KeyEvent e)` 
        
        `void`
        
        `[keyTyped](../../../simple/hooks/simplebot/Keyboard.html#keyTyped-java.awt.event.KeyEvent-)(java.awt.event.KeyEvent e)` 
        
        `void`
        
        `[pressKey](../../../simple/hooks/simplebot/Keyboard.html#pressKey-int-)(int keyCode)`
        
        Creates and sends a given PRESS KeyEvent using the given keyCode.
        
        `void`
        
        `[releaseKey](../../../simple/hooks/simplebot/Keyboard.html#releaseKey-int-)(int keyCode)`
        
        Creates and sends a given RELEASE KeyEvent using the given keyCode.
        
        `void`
        
        `[sendKeyEvent](../../../simple/hooks/simplebot/Keyboard.html#sendKeyEvent-java.awt.event.KeyEvent-)(java.awt.event.KeyEvent e)`
        
        Actually triggers sending of a given KeyEvent in the instance of KeyListeners' `component` field.
        
        `void`
        
        `[sendKeys](../../../simple/hooks/simplebot/Keyboard.html#sendKeys-java.lang.String-)(java.lang.String s)`
        
        Types the given String and afterwards presses Enter.
        
        `void`
        
        `[sendKeys](../../../simple/hooks/simplebot/Keyboard.html#sendKeys-java.lang.String-boolean-)(java.lang.String s, boolean enterAfter)`
        
        Types the given String and optionally presses Enter afterwards.
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### ENTER\_KEYCODE
            
            public static final int ENTER\_KEYCODE
            
            `KeyEvent.VK_ENTER` is actually New Line, '\\n'. The code for the Enter button is 13. It has no associated `KeyEvent` constant.
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Keyboard.ENTER_KEYCODE)
            
    
    *   ### Constructor Detail
        
        *   #### Keyboard
            
            public Keyboard(net.runelite.api.Client client)
            
    
    *   ### Method Detail
        
        *   #### getComponent
            
            public java.awt.Component getComponent()
            
        
        *   #### sendKeys
            
            public void sendKeys(java.lang.String s)
            
            Types the given String and afterwards presses Enter.
            
            Parameters:
            
            `s` - The String to type.
            
        
        *   #### sendKeys
            
            public void sendKeys(java.lang.String s,
                                 boolean enterAfter)
            
            Types the given String and optionally presses Enter afterwards.
            
            Parameters:
            
            `s` - The String to type.
            
            `enterAfter` - True if `KeyEvent.VK_ENTER` should be pressed afterwards. This is actually the '\\n' character, for New Line. Useful for logging in.
            
        
        *   #### clickKey
            
            public void clickKey(char c)
            
            Creates and sends a single KeyEvent using the given Char.
            
            Parameters:
            
            `c` - The char to send.
            
        
        *   #### clickKey
            
            public void clickKey(int keyCode)
            
            Creates and sends a given KeyEvent using the given keyCode.
            
            Use constants where possible, from `KeyEvent`, such as `KeyEvent.VK_ENTER`
            
            Parameters:
            
            `keyCode` - The keycode to send.
            
        
        *   #### pressKey
            
            public void pressKey(int keyCode)
            
            Creates and sends a given PRESS KeyEvent using the given keyCode. Note, this does not send a Release Event typically associated with a key click.
            
            Use constants where possible, from `KeyEvent`, such as `KeyEvent.VK_ENTER`
            
            Parameters:
            
            `keyCode` -
            
        
        *   #### releaseKey
            
            public void releaseKey(int keyCode)
            
            Creates and sends a given RELEASE KeyEvent using the given keyCode. Note, this does not send a Press Event typically associated with a key click.
            
            Use constants where possible, from `KeyEvent`, such as `KeyEvent.VK_ENTER`
            
            Parameters:
            
            `keyCode` -
            
        
        *   #### sendKeyEvent
            
            public void sendKeyEvent(java.awt.event.KeyEvent e)
            
            Actually triggers sending of a given KeyEvent in the instance of KeyListeners' `component` field.
            
            Parameters:
            
            `e` -
            
        
        *   #### keyPressed
            
            public void keyPressed(java.awt.event.KeyEvent e)
            
            Specified by:
            
            `keyPressed` in interface `java.awt.event.KeyListener`
            
        
        *   #### keyReleased
            
            public void keyReleased(java.awt.event.KeyEvent e)
            
            Specified by:
            
            `keyReleased` in interface `java.awt.event.KeyListener`
            
        
        *   #### keyTyped
            
            public void keyTyped(java.awt.event.KeyEvent e)
            
            Specified by:
            
            `keyTyped` in interface `java.awt.event.KeyListener`
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Keyboard.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Magic.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Keyboard.html)
*   [No Frames](Keyboard.html)

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