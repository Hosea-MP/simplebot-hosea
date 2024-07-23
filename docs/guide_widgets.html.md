   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Working with Widgets | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

[![SimpleBot Docs](/docs-api/assets/sb-logo.png)SimpleBot Docs](/docs-api/)

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

Search

⌃K

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

*   Guide
    
    *   [SimpleBot RuneLite API Documentation](/docs-api/guide/)
    *   [Query API](/docs-api/guide/query.html)
    *   [Interacting with NPCs](/docs-api/guide/npcs.html)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
        *   [Table of Contents](#table-of-contents)
        *   [Getting Widgets](#getting-widgets)
            *   [Getting a Widget by ID](#getting-a-widget-by-id)
            *   [Getting a Widget by WidgetInfo](#getting-a-widget-by-widgetinfo)
        *   [Finding a Widget and its ID](#finding-a-widget-and-its-id)
        *   [Interacting with Widgets](#interacting-with-widgets)
            *   [Interacting with a Widget using click(int option)](#interacting-with-a-widget-using-click-int-option)
            *   [Getting the Text of a Widget](#getting-the-text-of-a-widget)
            *   [Validating Widgets](#validating-widgets)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Working with Widgets](#working-with-widgets)
=============================================

Widgets are on screen components/interfaces such as the bank, inventory, game tabs, world map, etc. The SimpleBot API provides methods to interact with widgets in the game client.

Widgets are identified by a unique ID and a component ID. The ID is used to identify the exact widget, and the component ID is used to identify a specific element within the widget.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Getting Widgets](#getting-widgets)
    *   [Getting a Widget by ID](#getting-a-widget-by-id)
    *   [Getting a Widget by WidgetInfo](#getting-a-widget-by-widgetinfo)
*   [Finding a Widget and its ID](#finding-a-widget-and-its-id)
*   [Interacting with Widgets](#interacting-with-widgets)
    *   [Interacting with a Widget using `click(int option)`](#interacting-with-a-widget-using-click-int-option)
    *   [Getting the Text of a Widget](#getting-the-text-of-a-widget)
    *   [Validating Widgets](#validating-widgets)

[Getting Widgets](#getting-widgets)
-----------------------------------

### [Getting a Widget by ID](#getting-a-widget-by-id)

To find a widget by ID, use the `widgets.getWidget()` method with the widget ID and component ID. This returns a `SimpleWidget` object that represents the specified widget. Here's an example:

    final SimpleWidget inventory = ctx.widgets.getWidget(548, 65);
    if (inventory != null) {
        System.out.println("Found widget: " + inventory.getId());
    } else {
        System.out.println("Widget ID 548 not found.");
    }
    

### [Getting a Widget by WidgetInfo](#getting-a-widget-by-widgetinfo)

To find a widget by `WidgetInfo`, use the `widgets.getWidget()` method with the `WidgetInfo` object. This returns a `SimpleWidget` object that represents the specified widget. The `WidgetInfo` enum contains predefined widget IDs for common widgets in the game client, such as the inventory, bank, etc. The `WidgetInfo` enum is located in the `net.runelite.api.widgets` package. Here's an example of how to find the inventory widget using `WidgetInfo`:

    final SimpleWidget inventory = ctx.widgets.getWidget(WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB);
    if (inventory != null) {
        System.out.println("Found widget: " + inventory.getId());
    } else {
        System.out.println("WidgetInfo FIXED_VIEWPORT_INVENTORY_TAB not found.");
    }
    

[Finding a Widget and its ID](#finding-a-widget-and-its-id)
-----------------------------------------------------------

The best way to find a widget and its ID is to use the `RuneLite Widget Inspector`. The Widget Inspector is a tool that allows you to inspect the widgets in the game client and get their IDs and component IDs. You can access the Widget Inspector by opening the 'Developer Tools' tab on the RuneLite client and clicking on the 'Widget Inspector' button.

**Note**: The Widget Inspector is only available in the RuneLite client, and you need to have the developer tools plugin enabled. ![Widget Inspector](/docs-api/assets/widget-inspector.png)

[Interacting with Widgets](#interacting-with-widgets)
-----------------------------------------------------

Once you have found a widget, you can interact with it in various ways. The SimpleBot API provides methods to interact with widgets, such as clicking on them, getting their text, etc.

### [Interacting with a Widget using `click(int option)`](#interacting-with-a-widget-using-click-int-option)

To interact with a widget using the `click()` method, you can specify the action name or action index. The `click()` method simulates a left-click on the specified widget. The `option` parameter is the index of the action to perform on the widget. The index starts from 0 for the first action and increments by 1 for each subsequent action.

**Note:** that not all widgets have multiple actions, so using `click(0)` is usually sufficient to interact with a widget.

Here's an example of how to interact with a widget using the `click()` method:

    final SimpleWidget inventory = ctx.widgets.getWidget(548, 65);
    if (inventory != null) {
        inventory.click(0);
    } else {
        System.out.println("Widget ID 548 not found.");
    }
    

### [Getting the Text of a Widget](#getting-the-text-of-a-widget)

To get the text of a widget, use the `getText()` method. This returns the text displayed on the widget. Here's an example:

    final SimpleWidget chatbox = ctx.widgets.getWidget(162, 37);
    if (chatbox != null) {
        System.out.println("Chatbox text: " + chatbox.getText());
    } else {
        System.out.println("Widget ID 162 not found.");
    }
    

### [Validating Widgets](#validating-widgets)

The API offers the `isHidden()` and `visibleOnScreen()` methods to check if a widget is hidden or visible on the screen. The `isHidden()` method returns `true` if the widget is hidden, and `false` if it is visible. The `visibleOnScreen()` method returns `true` if the widget is visible on the screen, and `false` if it is not visible.

Typically only using `isHidden()` is sufficient to check if a widget is visible or not. However if a widget could be off screen e.g. a widget that has a scroll bar, then you would want to use `visibleOnScreen()` to check if the widget is visible on the screen.

Here's an example of how to validate a widget using the `isHidden()` method:

    final SimpleWidget chatbox = ctx.widgets.getWidget(162, 37);
    if (chatbox != null) {
        if (!chatbox.isHidden()) {
            System.out.println("Chatbox is visible.");
        } else {
            System.out.println("Chatbox is hidden.");
        }
    } else {
        System.out.println("Widget ID 162 not found.");
    }
    

Here's an example of how to validate a widget using the `visibleOnScreen()` method:

    final SimpleWidget chatbox = ctx.widgets.getWidget(162, 37);
    if (chatbox != null) {
        if (chatbox.visibleOnScreen()) {
            System.out.println("Chatbox is visible on screen.");
        } else {
            System.out.println("Chatbox is not visible on screen.");
        }
    } else {
        System.out.println("Widget ID 162 not found.");
    }
    

Last Updated: 4/27/2024, 10:39:32 PM

Contributors: the-reminisce

[

Prev

Interacting with Items and Inventory

](/docs-api/guide/items.html)[

Next

Walking and Movement

](/docs-api/guide/movement.html)