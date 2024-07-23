Trade   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Trade"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Trade.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/ScriptPaint.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Varpbits.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Trade.html)
*   [No Frames](Trade.html)

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

Class Trade
-----------

*   java.lang.Object
*   *   simple.hooks.simplebot.Trade

*   * * *
    
      
    
    public class Trade
    extends java.lang.Object
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static int`
        
        `[FIRST](../../../simple/hooks/simplebot/Trade.html#FIRST)` 
        
        `static int`
        
        `[SECOND](../../../simple/hooks/simplebot/Trade.html#SECOND)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Trade](../../../simple/hooks/simplebot/Trade.html#Trade-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `void`
        
        `[acceptTrade](../../../simple/hooks/simplebot/Trade.html#acceptTrade--)()` 
        
        `void`
        
        `[click](../../../simple/hooks/simplebot/Trade.html#click-net.runelite.api.widgets.WidgetItem-int-)(net.runelite.api.widgets.WidgetItem item, int option)` 
        
        `void`
        
        `[clickOption](../../../simple/hooks/simplebot/Trade.html#clickOption-net.runelite.api.widgets.WidgetItem-java.lang.String-)(net.runelite.api.widgets.WidgetItem item, java.lang.String option)` 
        
        `boolean`
        
        `[clickSuccess](../../../simple/hooks/simplebot/Trade.html#clickSuccess-net.runelite.api.widgets.WidgetItem-java.lang.String-)(net.runelite.api.widgets.WidgetItem item, java.lang.String option)` 
        
        `void`
        
        `[declineTrade](../../../simple/hooks/simplebot/Trade.html#declineTrade--)()` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        `[getItem](../../../simple/hooks/simplebot/Trade.html#getItem-int-boolean-)(int id, boolean partner)` 
        
        `[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")`
        
        `[getItemForName](../../../simple/hooks/simplebot/Trade.html#getItemForName-java.lang.String-boolean-)(java.lang.String name, boolean partner)` 
        
        `int`
        
        `[getPartnerFreeInventorySlots](../../../simple/hooks/simplebot/Trade.html#getPartnerFreeInventorySlots--)()` 
        
        `java.util.ArrayList<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")>`
        
        `[getPartnerTradeItems](../../../simple/hooks/simplebot/Trade.html#getPartnerTradeItems--)()` 
        
        `int`
        
        `[getPartnerTradeValue](../../../simple/hooks/simplebot/Trade.html#getPartnerTradeValue--)()` 
        
        `int`
        
        `[getTradeScreen](../../../simple/hooks/simplebot/Trade.html#getTradeScreen--)()` 
        
        `java.lang.String`
        
        `[getTradeState](../../../simple/hooks/simplebot/Trade.html#getTradeState--)()` 
        
        `java.lang.String`
        
        `[getTradingWithName](../../../simple/hooks/simplebot/Trade.html#getTradingWithName--)()` 
        
        `java.util.ArrayList<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")>`
        
        `[getYourTradeItems](../../../simple/hooks/simplebot/Trade.html#getYourTradeItems--)()` 
        
        `int`
        
        `[getYourTradeValue](../../../simple/hooks/simplebot/Trade.html#getYourTradeValue--)()` 
        
        `boolean`
        
        `[tradeOpen](../../../simple/hooks/simplebot/Trade.html#tradeOpen--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### FIRST
            
            public static final int FIRST
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Trade.FIRST)
            
        
        *   #### SECOND
            
            public static final int SECOND
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.Trade.SECOND)
            
    
    *   ### Constructor Detail
        
        *   #### Trade
            
            public Trade([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### clickSuccess
            
            public boolean clickSuccess(net.runelite.api.widgets.WidgetItem item,
                                        java.lang.String option)
            
        
        *   #### clickOption
            
            public void clickOption(net.runelite.api.widgets.WidgetItem item,
                                    java.lang.String option)
            
        
        *   #### click
            
            public void click(net.runelite.api.widgets.WidgetItem item,
                              int option)
            
        
        *   #### getItem
            
            public [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") getItem(int id,
                                      boolean partner)
            
        
        *   #### getItemForName
            
            public [SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers") getItemForName(java.lang.String name,
                                             boolean partner)
            
        
        *   #### getTradingWithName
            
            public java.lang.String getTradingWithName()
            
        
        *   #### getTradeScreen
            
            public int getTradeScreen()
            
        
        *   #### getTradeState
            
            public java.lang.String getTradeState()
            
        
        *   #### getPartnerFreeInventorySlots
            
            public int getPartnerFreeInventorySlots()
            
        
        *   #### getYourTradeValue
            
            public int getYourTradeValue()
            
        
        *   #### getPartnerTradeValue
            
            public int getPartnerTradeValue()
            
        
        *   #### tradeOpen
            
            public boolean tradeOpen()
            
        
        *   #### declineTrade
            
            public void declineTrade()
            
        
        *   #### acceptTrade
            
            public void acceptTrade()
            
        
        *   #### getYourTradeItems
            
            public java.util.ArrayList<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\> getYourTradeItems()
            
        
        *   #### getPartnerTradeItems
            
            public java.util.ArrayList<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\> getPartnerTradeItems()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Trade.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/ScriptPaint.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Varpbits.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Trade.html)
*   [No Frames](Trade.html)

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