SimpleBank   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleBank"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10,"i17":10,"i18":10,"i19":10,"i20":10,"i21":10,"i22":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleBank.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleBank.html)
*   [No Frames](SimpleBank.html)

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

simple.hooks.filters

Class SimpleBank
----------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.filters.SimpleBank

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class SimpleBank
    extends [SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\>
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleBank](../../../simple/hooks/filters/SimpleBank.html#SimpleBank-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[bankOpen](../../../simple/hooks/filters/SimpleBank.html#bankOpen--)()`
        
        Checks if the bank is open
        
        `boolean`
        
        `[closeBank](../../../simple/hooks/filters/SimpleBank.html#closeBank--)()`
        
        Closes the bank or depositbox if it's open
        
        `boolean`
        
        `[deposit](../../../simple/hooks/filters/SimpleBank.html#deposit-int-int-)(int id, int amount)`
        
        Deposit's {amount} of item with id={id}
        
        `boolean`
        
        `[deposit](../../../simple/hooks/filters/SimpleBank.html#deposit-int-simple.hooks.filters.SimpleBank.Amount-)(int id, [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)` 
        
        `boolean`
        
        `[deposit](../../../simple/hooks/filters/SimpleBank.html#deposit-java.lang.String-int-)(java.lang.String name, int amount)`
        
        Deposit's {amount} of item with name={name}
        
        `boolean`
        
        `[deposit](../../../simple/hooks/filters/SimpleBank.html#deposit-java.lang.String-simple.hooks.filters.SimpleBank.Amount-)(java.lang.String name, [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)`
        
        Deposit's {amount} of item with name={name}
        
        `boolean`
        
        `[depositAllExcept](../../../simple/hooks/filters/SimpleBank.html#depositAllExcept-int...-)(int... ids)`
        
        Deposit's all items who's id match {ids}
        
        `boolean`
        
        `[depositAllExcept](../../../simple/hooks/filters/SimpleBank.html#depositAllExcept-java.util.function.Predicate-)(java.util.function.Predicate<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")> filter)`
        
        Deposit's all items that aren't accepted by the {filter}
        
        `boolean`
        
        `[depositAllExcept](../../../simple/hooks/filters/SimpleBank.html#depositAllExcept-java.lang.String...-)(java.lang.String... names)`
        
        Deposit's all items name's that match {names}
        
        `boolean`
        
        `[depositBoxOpen](../../../simple/hooks/filters/SimpleBank.html#depositBoxOpen--)()`
        
        Checks if deposit box is open
        
        `boolean`
        
        `[depositEquipment](../../../simple/hooks/filters/SimpleBank.html#depositEquipment--)()`
        
        Clicks the deposit equipment widget in the runescape bank
        
        `boolean`
        
        `[depositInventory](../../../simple/hooks/filters/SimpleBank.html#depositInventory--)()`
        
        Clicks the deposit inventory widget in the runescape bank
        
        `int`
        
        `[getTabsAvailable](../../../simple/hooks/filters/SimpleBank.html#getTabsAvailable--)()`
        
        Sums up how many tabs you have available.
        
        `boolean`
        
        `[notedMode](../../../simple/hooks/filters/SimpleBank.html#notedMode--)()`
        
        Returns whether the bank noted mode is toggled
        
        `int`
        
        `[openTab](../../../simple/hooks/filters/SimpleBank.html#openTab--)()`
        
        Gets the current tab open.
        
        `boolean`
        
        `[openTab](../../../simple/hooks/filters/SimpleBank.html#openTab-int-)(int tab)`
        
        Opens the selected bank tab.
        
        `[SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")`
        
        `[quantityMode](../../../simple/hooks/filters/SimpleBank.html#quantityMode--)()` 
        
        `boolean`
        
        `[toggleNotedItem](../../../simple/hooks/filters/SimpleBank.html#toggleNotedItem-boolean-)(boolean noted)`
        
        Toggles noted or non noted mode in the runescape bank
        
        `boolean`
        
        `[withdraw](../../../simple/hooks/filters/SimpleBank.html#withdraw-int-int-)(int id, int amount)`
        
        Withdraws {amount} of item with id={id}
        
        `boolean`
        
        `[withdraw](../../../simple/hooks/filters/SimpleBank.html#withdraw-int-simple.hooks.filters.SimpleBank.Amount-)(int id, [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)`
        
        Withdraws {amount} of item with id={id}
        
        `boolean`
        
        `[withdraw](../../../simple/hooks/filters/SimpleBank.html#withdraw-java.lang.String-int-)(java.lang.String name, int amount)`
        
        Withdraws {amount} of item with name={name}
        
        `boolean`
        
        `[withdraw](../../../simple/hooks/filters/SimpleBank.html#withdraw-java.lang.String-simple.hooks.filters.SimpleBank.Amount-)(java.lang.String name, [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)`
        
        Withdraws {amount} of item with name={name}
        
        `int`
        
        `[withdrawXAmount](../../../simple/hooks/filters/SimpleBank.html#withdrawXAmount--)()` 
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleItemQuery](../../../simple/hooks/queries/SimpleItemQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-int...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.util.regex.Pattern...-), [filter](../../../simple/hooks/queries/SimpleItemQuery.html#filter-java.lang.String...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.util.regex.Pattern...-), [filterHasAction](../../../simple/hooks/queries/SimpleItemQuery.html#filterHasAction-java.lang.String...-), [population](../../../simple/hooks/queries/SimpleItemQuery.html#population-boolean-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### SimpleBank
            
            public SimpleBank([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") c)
            
    
    *   ### Method Detail
        
        *   #### withdraw
            
            public boolean withdraw(int id,
                                    [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)
            
            Withdraws {amount} of item with id={id}
            
            Parameters:
            
            `id` -
            
            `amount` -
            
            Returns:
            
        
        *   #### withdraw
            
            public boolean withdraw(java.lang.String name,
                                    [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)
            
            Withdraws {amount} of item with name={name}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### withdraw
            
            public boolean withdraw(int id,
                                    int amount)
            
            Withdraws {amount} of item with id={id}
            
            Parameters:
            
            `id` -
            
            `amount` -
            
            Returns:
            
        
        *   #### withdraw
            
            public boolean withdraw(java.lang.String name,
                                    int amount)
            
            Withdraws {amount} of item with name={name}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### deposit
            
            public boolean deposit(int id,
                                   [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)
            
        
        *   #### deposit
            
            public boolean deposit(int id,
                                   int amount)
            
            Deposit's {amount} of item with id={id}
            
            Parameters:
            
            `id` -
            
            `amount` -
            
            Returns:
            
        
        *   #### deposit
            
            public boolean deposit(java.lang.String name,
                                   [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") amount)
            
            Deposit's {amount} of item with name={name}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### deposit
            
            public boolean deposit(java.lang.String name,
                                   int amount)
            
            Deposit's {amount} of item with name={name}
            
            Parameters:
            
            `name` -
            
            `amount` -
            
            Returns:
            
        
        *   #### depositAllExcept
            
            public boolean depositAllExcept(int... ids)
            
            Deposit's all items who's id match {ids}
            
            Parameters:
            
            `ids` -
            
            Returns:
            
        
        *   #### depositAllExcept
            
            public boolean depositAllExcept(java.lang.String... names)
            
            Deposit's all items name's that match {names}
            
            Parameters:
            
            `names` -
            
            Returns:
            
        
        *   #### depositAllExcept
            
            public boolean depositAllExcept(java.util.function.Predicate<[SimpleItem](../../../simple/hooks/wrappers/SimpleItem.html "class in simple.hooks.wrappers")\> filter)
            
            Deposit's all items that aren't accepted by the {filter}
            
            Parameters:
            
            `filter` -
            
            Returns:
            
        
        *   #### bankOpen
            
            public boolean bankOpen()
            
            Checks if the bank is open
            
            Returns:
            
        
        *   #### depositBoxOpen
            
            public boolean depositBoxOpen()
            
            Checks if deposit box is open
            
            Returns:
            
        
        *   #### notedMode
            
            public boolean notedMode()
            
            Returns whether the bank noted mode is toggled
            
            Returns:
            
        
        *   #### depositInventory
            
            public boolean depositInventory()
            
            Clicks the deposit inventory widget in the runescape bank
            
            Returns:
            
            \- whether the widget has been clicked or not
            
        
        *   #### depositEquipment
            
            public boolean depositEquipment()
            
            Clicks the deposit equipment widget in the runescape bank
            
            Returns:
            
            \- whether the widget has been clicked or not
            
        
        *   #### closeBank
            
            public boolean closeBank()
            
            Closes the bank or depositbox if it's open
            
            Returns:
            
            \- if bank and deposit box are closed
            
        
        *   #### toggleNotedItem
            
            public boolean toggleNotedItem(boolean noted)
            
            Toggles noted or non noted mode in the runescape bank
            
            Parameters:
            
            `noted` -
            
            Returns:
            
            \- if the bank is opened and we switched
            
        
        *   #### quantityMode
            
            public [SimpleBank.Amount](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters") quantityMode()
            
        
        *   #### withdrawXAmount
            
            public int withdrawXAmount()
            
        
        *   #### openTab
            
            public int openTab()
            
            Gets the current tab open.
            
            Returns:
            
            returns the current tab open.
            
        
        *   #### openTab
            
            public boolean openTab(int tab)
            
            Opens the selected bank tab.
            
            Parameters:
            
            `tab` - The bank tab id. 0 is for all items, 1-9 are the tabs.
            
            Returns:
            
            returns {true} if the tab was opened successfully
            
        
        *   #### getTabsAvailable
            
            public int getTabsAvailable()
            
            Sums up how many tabs you have available.
            
            Returns:
            
            returns the amount of tabs available. The view all tab counts as one.
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleBank.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   Prev Class
*   [Next Class](../../../simple/hooks/filters/SimpleBank.Amount.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleBank.html)
*   [No Frames](SimpleBank.html)

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