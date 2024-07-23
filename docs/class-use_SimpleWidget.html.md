Uses of Class simple.hooks.wrappers.SimpleWidget   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Uses of Class simple.hooks.wrappers.SimpleWidget"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/wrappers/class-use/SimpleWidget.html)
*   [No Frames](SimpleWidget.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

Uses of Class  
simple.hooks.wrappers.SimpleWidget
--------------------------------------------------

*   Packages that use [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
    
    Package
    
    Description
    
    [simple.hooks.filters](#simple.hooks.filters)
    
     
    
    [simple.hooks.simplebot](#simple.hooks.simplebot)
    
     
    
    [simple.hooks.simplebot.teleporter](#simple.hooks.simplebot.teleporter)
    
     
    
    [simple.hooks.wrappers](#simple.hooks.wrappers)
    
     
    
*   *   ### Uses of [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html)
        
        Methods in [simple.hooks.filters](../../../../simple/hooks/filters/package-summary.html) that return [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        SimpleWidgets.`[getWidget](../../../../simple/hooks/filters/SimpleWidgets.html#getWidget-int-int-)(int index, int archive)`
        
        returns a {SimpleWidget} based on the {widgetId} and {componentId}
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        SimpleWidgets.`[getWidget](../../../../simple/hooks/filters/SimpleWidgets.html#getWidget-net.runelite.api.widgets.WidgetInfo-)(net.runelite.api.widgets.WidgetInfo info)`
        
        returns a {SimpleWidget} based on {info}.
        
    *   ### Uses of [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html)
        
        Methods in [simple.hooks.simplebot](../../../../simple/hooks/simplebot/package-summary.html) that return [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        Dialogue.`[getContinueButton](../../../../simple/hooks/simplebot/Dialogue.html#getContinueButton--)()`
        
        Will return the SimpleWidget resembling the continue button
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        Dialogue.`[getDialogueOptions](../../../../simple/hooks/simplebot/Dialogue.html#getDialogueOptions--)()`
        
        Will return an array of SimpleWidgets resembling the open options inside of the chatbox
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        Dialogue.`[getOpenDialogueWidget](../../../../simple/hooks/simplebot/Dialogue.html#getOpenDialogueWidget--)()`
        
        Will return a SimpleWidget resembling the chatbox that is currently open
        
    *   ### Uses of [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") in [simple.hooks.simplebot.teleporter](../../../../simple/hooks/simplebot/teleporter/package-summary.html)
        
        Constructors in [simple.hooks.simplebot.teleporter](../../../../simple/hooks/simplebot/teleporter/package-summary.html) with parameters of type [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
        
        Constructor and Description
        
        `[TeleporterOption](../../../../simple/hooks/simplebot/teleporter/TeleporterOption.html#TeleporterOption-java.lang.String-int-simple.hooks.wrappers.SimpleWidget-)(java.lang.String teleportName, int index, [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") option)` 
        
    *   ### Uses of [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html)
        
        Methods in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html) that return [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        SimpleWidget.`[getChild](../../../../simple/hooks/wrappers/SimpleWidget.html#getChild-int-)(int index)` 
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        SimpleWidget.`[getChildren](../../../../simple/hooks/wrappers/SimpleWidget.html#getChildren--)()` 
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        SimpleWidget.`[getDynamicChildren](../../../../simple/hooks/wrappers/SimpleWidget.html#getDynamicChildren--)()` 
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        SimpleWidget.`[getNestedChildren](../../../../simple/hooks/wrappers/SimpleWidget.html#getNestedChildren--)()` 
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        SimpleWidget.`[getParent](../../../../simple/hooks/wrappers/SimpleWidget.html#getParent--)()` 
        
        `[SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")[]`
        
        SimpleWidget.`[getStaticChildren](../../../../simple/hooks/wrappers/SimpleWidget.html#getStaticChildren--)()` 
        
        Constructors in [simple.hooks.wrappers](../../../../simple/hooks/wrappers/package-summary.html) with parameters of type [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") 
        
        Constructor and Description
        
        `[SimpleChatOption](../../../../simple/hooks/wrappers/SimpleChatOption.html#SimpleChatOption-int-simple.hooks.wrappers.SimpleWidget-)(int index, [SimpleWidget](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") option)` 
        

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../../overview-summary.html)
*   [Package](../package-summary.html)
*   [Class](../../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")
*   Use
*   [Tree](../package-tree.html)
*   [Deprecated](../../../../deprecated-list.html)
*   [Index](../../../../index-files/index-1.html)
*   [Help](../../../../help-doc.html)

*   Prev
*   Next

*   [Frames](../../../../index.html?simple/hooks/wrappers/class-use/SimpleWidget.html)
*   [No Frames](SimpleWidget.html)

*   [All Classes](../../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->