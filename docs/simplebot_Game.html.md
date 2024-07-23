Game   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Game"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10,"i17":10,"i18":10,"i19":10,"i20":10,"i21":10,"i22":10,"i23":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Game.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/FairyRing.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Game.ClientType.html "enum in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Game.html)
*   [No Frames](Game.html)

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

Class Game
----------

*   java.lang.Object
*   *   simple.hooks.simplebot.Game

*   * * *
    
      
    
    public class Game
    extends java.lang.Object
    
    Created by Seth on Oct 8, 2019 at 4:08:28 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[Game.ClientType](../../../simple/hooks/simplebot/Game.ClientType.html "enum in simple.hooks.simplebot")`
        
        An enum of the different Client types
        
        `static class` 
        
        `[Game.Crosshair](../../../simple/hooks/simplebot/Game.Crosshair.html "enum in simple.hooks.simplebot")` 
        
        `static class` 
        
        `[Game.Tab](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot")`
        
        Enum that represents the different tabs in the game interface
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Game](../../../simple/hooks/simplebot/Game.html#Game-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `java.lang.String`
        
        `[clientName](../../../simple/hooks/simplebot/Game.html#clientName--)()`
        
        will return the name of the client
        
        `[Game.ClientType](../../../simple/hooks/simplebot/Game.ClientType.html "enum in simple.hooks.simplebot")`
        
        `[clientType](../../../simple/hooks/simplebot/Game.html#clientType--)()`
        
        will return the client type the bot is running on : {ClientType.ATLAS, ClientType.ZENYTE}
        
        `[Game.Crosshair](../../../simple/hooks/simplebot/Game.Crosshair.html "enum in simple.hooks.simplebot")`
        
        `[crosshair](../../../simple/hooks/simplebot/Game.html#crosshair--)()` 
        
        `java.awt.Dimension`
        
        `[dimensions](../../../simple/hooks/simplebot/Game.html#dimensions--)()`
        
        will return the dimension's of the game client
        
        `boolean`
        
        `[escapeClosing](../../../simple/hooks/simplebot/Game.html#escapeClosing--)()`
        
        will return if the client user has escape closing enabled or not
        
        `java.lang.String`
        
        `[getClientName](../../../simple/hooks/simplebot/Game.html#getClientName--)()`
        
        will return the String name of the client
        
        `java.lang.String[]`
        
        `[getMenuActions](../../../simple/hooks/simplebot/Game.html#getMenuActions--)()`
        
        will return the actions in the menu
        
        `int`
        
        `[getMenuCount](../../../simple/hooks/simplebot/Game.html#getMenuCount--)()`
        
        will return the amount of menu options are in the menu
        
        `java.lang.String[]`
        
        `[getMenuOptions](../../../simple/hooks/simplebot/Game.html#getMenuOptions--)()`
        
        will return the options in the menu
        
        `boolean`
        
        `[inViewport](../../../simple/hooks/simplebot/Game.html#inViewport-net.runelite.api.Point-)(net.runelite.api.Point p)`
        
        If a point is inside of the dimensions of the game client
        
        `boolean`
        
        `[inViewport](../../../simple/hooks/simplebot/Game.html#inViewport-java.awt.Rectangle-)(java.awt.Rectangle rect)`
        
        If a rectangle is inside of the dimensions of the game client
        
        `net.runelite.api.coords.WorldPoint`
        
        `[mapOffset](../../../simple/hooks/simplebot/Game.html#mapOffset--)()`
        
        will return the base client location
        
        `java.awt.Rectangle`
        
        `[menuBounds](../../../simple/hooks/simplebot/Game.html#menuBounds--)()`
        
        will return a rectangle with the bounds of the menu if it is open
        
        `int`
        
        `[menuHeight](../../../simple/hooks/simplebot/Game.html#menuHeight--)()`
        
        will return the height of the menu
        
        `boolean`
        
        `[menuOpened](../../../simple/hooks/simplebot/Game.html#menuOpened--)()`
        
        will return {true} if the menu is opened
        
        `int`
        
        `[menuWidth](../../../simple/hooks/simplebot/Game.html#menuWidth--)()`
        
        will return the width of the menu
        
        `int`
        
        `[menuX](../../../simple/hooks/simplebot/Game.html#menuX--)()`
        
        will return the x canvas point of the menu
        
        `int`
        
        `[menuY](../../../simple/hooks/simplebot/Game.html#menuY--)()`
        
        will return the y canvas point of the menu
        
        `boolean`
        
        `[pointInViewport](../../../simple/hooks/simplebot/Game.html#pointInViewport-double-double-)(double x, double y)`
        
        If a (x,y) point is inside of the dimensions of the game client
        
        `boolean`
        
        `[pointInViewport](../../../simple/hooks/simplebot/Game.html#pointInViewport-int-int-)(int x, int y)`
        
        If a (x,y) point is inside of the dimensions of the game client
        
        `boolean`
        
        `[resizable](../../../simple/hooks/simplebot/Game.html#resizable--)()`
        
        will return if the client is in resizeable mode
        
        `[Game.Tab](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot")`
        
        `[tab](../../../simple/hooks/simplebot/Game.html#tab--)()`
        
        will return the current tab you have opened
        
        `boolean`
        
        `[tab](../../../simple/hooks/simplebot/Game.html#tab-simple.hooks.simplebot.Game.Tab-)([Game.Tab](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot") tab)`
        
        will switch to the specified {tab} and return {true} if successful and {false} otherwise
        
        `int`
        
        `[tileHeight](../../../simple/hooks/simplebot/Game.html#tileHeight-int-int-)(int x, int y)` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Game
            
            public Game([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### clientName
            
            public java.lang.String clientName()
            
            will return the name of the client
            
            Returns:
            
        
        *   #### clientType
            
            public [Game.ClientType](../../../simple/hooks/simplebot/Game.ClientType.html "enum in simple.hooks.simplebot") clientType()
            
            will return the client type the bot is running on : {ClientType.ATLAS, ClientType.ZENYTE}
            
            Returns:
            
        
        *   #### menuOpened
            
            public boolean menuOpened()
            
            will return {true} if the menu is opened
            
            Returns:
            
        
        *   #### menuBounds
            
            public java.awt.Rectangle menuBounds()
            
            will return a rectangle with the bounds of the menu if it is open
            
            Returns:
            
        
        *   #### menuX
            
            public int menuX()
            
            will return the x canvas point of the menu
            
            Returns:
            
        
        *   #### menuY
            
            public int menuY()
            
            will return the y canvas point of the menu
            
            Returns:
            
        
        *   #### menuWidth
            
            public int menuWidth()
            
            will return the width of the menu
            
            Returns:
            
        
        *   #### menuHeight
            
            public int menuHeight()
            
            will return the height of the menu
            
            Returns:
            
        
        *   #### tileHeight
            
            public int tileHeight(int x,
                                  int y)
            
        
        *   #### getMenuCount
            
            public int getMenuCount()
            
            will return the amount of menu options are in the menu
            
            Returns:
            
        
        *   #### getMenuOptions
            
            public java.lang.String\[\] getMenuOptions()
            
            will return the options in the menu
            
            Returns:
            
        
        *   #### getMenuActions
            
            public java.lang.String\[\] getMenuActions()
            
            will return the actions in the menu
            
            Returns:
            
        
        *   #### dimensions
            
            public java.awt.Dimension dimensions()
            
            will return the dimension's of the game client
            
            Returns:
            
        
        *   #### inViewport
            
            public boolean inViewport(java.awt.Rectangle rect)
            
            If a rectangle is inside of the dimensions of the game client
            
            Parameters:
            
            `rect` -
            
            Returns:
            
        
        *   #### inViewport
            
            public boolean inViewport(net.runelite.api.Point p)
            
            If a point is inside of the dimensions of the game client
            
            Parameters:
            
            `p` -
            
            Returns:
            
        
        *   #### pointInViewport
            
            public boolean pointInViewport(double x,
                                           double y)
            
            If a (x,y) point is inside of the dimensions of the game client
            
            Parameters:
            
            `x,` - y (double)
            
            Returns:
            
        
        *   #### pointInViewport
            
            public boolean pointInViewport(int x,
                                           int y)
            
            If a (x,y) point is inside of the dimensions of the game client
            
            Parameters:
            
            `x,` - y (int)
            
            Returns:
            
        
        *   #### mapOffset
            
            public net.runelite.api.coords.WorldPoint mapOffset()
            
            will return the base client location
            
            Returns:
            
        
        *   #### escapeClosing
            
            public boolean escapeClosing()
            
            will return if the client user has escape closing enabled or not
            
            Returns:
            
            \- {true}=enabled, {false}=disabled
            
        
        *   #### tab
            
            public boolean tab([Game.Tab](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot") tab)
            
            will switch to the specified {tab} and return {true} if successful and {false} otherwise
            
            Parameters:
            
            `tab` -
            
            Returns:
            
        
        *   #### tab
            
            public [Game.Tab](../../../simple/hooks/simplebot/Game.Tab.html "enum in simple.hooks.simplebot") tab()
            
            will return the current tab you have opened
            
            Returns:
            
        
        *   #### resizable
            
            public boolean resizable()
            
            will return if the client is in resizeable mode
            
            Returns:
            
        
        *   #### getClientName
            
            public java.lang.String getClientName()
            
            will return the String name of the client
            
            Returns:
            
        
        *   #### crosshair
            
            public [Game.Crosshair](../../../simple/hooks/simplebot/Game.Crosshair.html "enum in simple.hooks.simplebot") crosshair()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Game.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/FairyRing.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Game.ClientType.html "enum in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Game.html)
*   [No Frames](Game.html)

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