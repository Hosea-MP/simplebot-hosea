   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } Interacting with Items and Inventory | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

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
        *   [Table of Contents](#table-of-contents)
        *   [Querying Items](#querying-items)
            *   [Finding an Item by Name](#finding-an-item-by-name)
            *   [Finding an Item by ID](#finding-an-item-by-id)
        *   [Interacting with Items](#interacting-with-items)
            *   [Interacting with an item using click()](#interacting-with-an-item-using-click)
            *   [Interacting with an item using menuAction()](#interacting-with-an-item-using-menuaction)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[Interacting with Items and Inventory](#interacting-with-items-and-inventory)
=============================================================================

In Old School RuneScape (OSRS), items and inventory management are essential for successful gameplay automation. This page explains how to query and interact with items and inventory using the SimpleBot API.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Querying Items](#querying-items)
    *   [Finding an Item by Name](#finding-an-item-by-name)
    *   [Finding an Item by ID](#finding-an-item-by-id)
*   [Interacting with Items](#interacting-with-items)
    *   [Interacting with an item using `click()`](#interacting-with-an-item-using-click)
    *   [Interacting with an item using `menuAction()`](#interacting-with-an-item-using-menuaction)

[Querying Items](#querying-items)
---------------------------------

To interact with items, you first need to find them within the game world. The SimpleBot API provides functions to search for items by various attributes such as name, ID, or actions they can perform. You can learn more about querying in the [Querying](/docs-api/guide/query.html) guide.

Here's an example of how to populate the inventory:

    ctx.inventory.populate(); // Populate the inventory
    

### [Finding an Item by Name](#finding-an-item-by-name)

To find an item in your inventory by name, use the `inventory.populate().filter()` method. This returns the first item in your inventory that matches the specified name. Here's an example:

    final SimpleItem sword = ctx.inventory.populate().filter("Bronze sword").next();
    if (sword != null) {
        System.out.println("Found item: " + sword.getName());
    } else {
        System.out.println("Item Bronze sword not found in inventory.");
    }
    

### [Finding an Item by ID](#finding-an-item-by-id)

To find an item in your inventory by ID, use the `inventory.populate().filter()` method with the item ID. This returns the first item in your inventory with the specified ID. Here's an example:

    final SimpleItem fish = ctx.inventory.populate().filter(317).next();
    if (fish != null) {
        System.out.println("Found item: " + fish.getName());
    } else {
        System.out.println("Item ID 317 not found in inventory.");
    }
    

[Interacting with Items](#interacting-with-items)
-------------------------------------------------

Once you have found an item, you can interact with it in various ways. The SimpleBot API provides two methods to interact with items: `click()` and `menuAction()`.

The `click()` method uses the built-in SimpleBot Mouse API to interact with items and has two overloads: one for clicking a specific action by action name and another for clicking the item by action index.

The `menuAction()` method uses the built-in SimpleBot Menu Action API to interact with items and has two overloads: one for sending a specific action by action name and another for sending a specific action by menu action id.

### [Interacting with an item using `click()`](#interacting-with-an-item-using-click)

To interact with an item using the `click()` method, you can specify the action name or action index.

Using the action name `click("Eat")` will ALWAYS perform an action using a right-click, while using the action index `click(0)` will ONLY perform a right-click if the index is greater than 0.

Here's an example of clicking an item using both:

    final SimpleItem shark = ctx.inventory.populate().filter("Shark").next();
    if (shark != null) {
      // Click the "Eat" action on the item
      shark.click("Eat");
      // Click the item by action index (0 is the first action). This will perform a left-click if the index is 0.
      shark.click(0);
    } else {
        System.out.println("Item Shark not found in inventory.");
    }
    

### [Interacting with an item using `menuAction()`](#interacting-with-an-item-using-menuaction)

To interact with an item using the `menuAction()` method, you can specify the action name or menu action id.

Here's an example of sending a menu action to an item using both:

    final SimpleItem shark = ctx.inventory.populate().filter("Shark").next();
    if (shark != null) {
      // Send the "Eat" action to the item
      shark.menuAction("Eat");
      // Send the menu action by menu action id (you can find the menu action id by using the SimpleBot Menu Action Debugger dev tool)
      shark.menuAction(3);
    } else {
        System.out.println("Item Shark not found in inventory.");
    }
    

Last Updated: 4/28/2024, 3:35:51 PM

Contributors: the-reminisce

[

Prev

Interacting with Objects

](/docs-api/guide/objects.html)[

Next

Working with Widgets

](/docs-api/guide/widgets.html)