SimpleWidgets   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleWidgets"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleWidgets.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/filters/SimpleWidgets.html)
*   [No Frames](SimpleWidgets.html)

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

simple.hooks.filters

Class SimpleWidgets
-------------------

*   java.lang.Object
*   *   simple.hooks.filters.SimpleWidgets

*   * * *
    
      
    
    public class SimpleWidgets
    extends java.lang.Object
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleWidgets](../../../simple/hooks/filters/SimpleWidgets.html#SimpleWidgets-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `[SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        `[getWidget](../../../simple/hooks/filters/SimpleWidgets.html#getWidget-int-int-)(int index, int archive)`
        
        returns a {SimpleWidget} based on the {widgetId} and {componentId}
        
        `[SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers")`
        
        `[getWidget](../../../simple/hooks/filters/SimpleWidgets.html#getWidget-net.runelite.api.widgets.WidgetInfo-)(net.runelite.api.widgets.WidgetInfo info)`
        
        returns a {SimpleWidget} based on {info}.
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### SimpleWidgets
            
            public SimpleWidgets([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)
            
    
    *   ### Method Detail
        
        *   #### getWidget
            
            public [SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") getWidget(net.runelite.api.widgets.WidgetInfo info)
            
            returns a {SimpleWidget} based on {info}. Uses runelite's list of documented widgets
            
            Parameters:
            
            `info` -
            
            Returns:
            
        
        *   #### getWidget
            
            public [SimpleWidget](../../../simple/hooks/wrappers/SimpleWidget.html "class in simple.hooks.wrappers") getWidget(int index,
                                          int archive)
            
            returns a {SimpleWidget} based on the {widgetId} and {componentId}
            
            Parameters:
            
            `index` -
            
            `archive` -
            
            Returns:
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleWidgets.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/filters/SimpleWidgets.html)
*   [No Frames](SimpleWidgets.html)

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