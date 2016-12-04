{:foreign-libs [
;; generated by generate_deps.py
{:file "blockly/core/warning.js"
 :provides ["Blockly.Warning"]
 :requires ["Blockly.Bubble" "Blockly.Icon"]}
{:file "blockly/core/field.js"
 :provides ["Blockly.Field"]
 :requires ["goog.asserts" "goog.dom" "goog.math.Size" "goog.style" "goog.userAgent"]}
{:file "blockly/core/scrollbar.js"
 :provides ["Blockly.Scrollbar" "Blockly.ScrollbarPair"]
 :requires ["goog.dom" "goog.events"]}
{:file "blockly/core/comment.js"
 :provides ["Blockly.Comment"]
 :requires ["Blockly.Bubble" "Blockly.Icon" "goog.userAgent"]}
{:file "blockly/core/events.js"
 :provides ["Blockly.Events"]
 :requires ["goog.math.Coordinate"]}
{:file "blockly/core/trashcan.js"
 :provides ["Blockly.Trashcan"]
 :requires ["goog.Timer" "goog.dom" "goog.math" "goog.math.Rect"]}
{:file "blockly/core/connection.js"
 :provides ["Blockly.Connection"]
 :requires ["goog.asserts" "goog.dom"]}
{:file "blockly/core/widgetdiv.js"
 :provides ["Blockly.WidgetDiv"]
 :requires ["Blockly.Css" "goog.dom" "goog.dom.TagName" "goog.style"]}
{:file "blockly/core/blockly.js"
 :provides ["Blockly"]
 :requires ["Blockly.BlockSvg.render" "Blockly.Events" "Blockly.FieldAngle" "Blockly.FieldCheckbox" "Blockly.FieldColour" "Blockly.FieldDropdown" "Blockly.FieldImage" "Blockly.FieldTextInput" "Blockly.FieldNumber" "Blockly.FieldVariable" "Blockly.Generator" "Blockly.Msg" "Blockly.Procedures" "Blockly.Toolbox" "Blockly.WidgetDiv" "Blockly.WorkspaceSvg" "Blockly.constants" "Blockly.inject" "Blockly.utils" "goog.color" "goog.userAgent"]}
{:file "blockly/core/flyout_button.js"
 :provides ["Blockly.FlyoutButton"]
 :requires ["goog.dom" "goog.math.Coordinate"]}
{:file "blockly/core/block_render_svg.js"
 :provides ["Blockly.BlockSvg.render"]
 :requires ["Blockly.BlockSvg"]}
{:file "blockly/core/utils.js"
 :provides ["Blockly.utils"]
 :requires ["goog.dom" "goog.events.BrowserFeature" "goog.math.Coordinate" "goog.userAgent"]}
{:file "blockly/core/msg.js"
 :provides ["Blockly.Msg"]
 :requires []}
{:file "blockly/core/contextmenu.js"
 :provides ["Blockly.ContextMenu"]
 :requires ["goog.dom" "goog.events" "goog.style" "goog.ui.Menu" "goog.ui.MenuItem"]}
{:file "blockly/core/icon.js"
 :provides ["Blockly.Icon"]
 :requires ["goog.dom" "goog.math.Coordinate"]}
{:file "blockly/core/field_textinput.js"
 :provides ["Blockly.FieldTextInput"]
 :requires ["Blockly.Field" "Blockly.Msg" "goog.asserts" "goog.dom" "goog.dom.TagName" "goog.userAgent"]}
{:file "blockly/core/toolbox.js"
 :provides ["Blockly.Toolbox"]
 :requires ["Blockly.Flyout" "goog.dom" "goog.dom.TagName" "goog.events" "goog.events.BrowserFeature" "goog.html.SafeHtml" "goog.html.SafeStyle" "goog.math.Rect" "goog.style" "goog.ui.tree.TreeControl" "goog.ui.tree.TreeNode"]}
{:file "blockly/core/options.js"
 :provides ["Blockly.Options"]
 :requires []}
{:file "blockly/core/block.js"
 :provides ["Blockly.Block"]
 :requires ["Blockly.Blocks" "Blockly.Comment" "Blockly.Connection" "Blockly.Input" "Blockly.Mutator" "Blockly.Warning" "Blockly.Workspace" "Blockly.Xml" "goog.array" "goog.asserts" "goog.math.Coordinate" "goog.string"]}
{:file "blockly/core/block_svg.js"
 :provides ["Blockly.BlockSvg"]
 :requires ["Blockly.Block" "Blockly.ContextMenu" "Blockly.RenderedConnection" "goog.Timer" "goog.asserts" "goog.dom" "goog.math.Coordinate" "goog.userAgent"]}
{:file "blockly/core/field_dropdown.js"
 :provides ["Blockly.FieldDropdown"]
 :requires ["Blockly.Field" "goog.dom" "goog.events" "goog.style" "goog.ui.Menu" "goog.ui.MenuItem" "goog.userAgent"]}
{:file "blockly/core/css.js"
 :provides ["Blockly.Css"]
 :requires []}
{:file "blockly/core/field_checkbox.js"
 :provides ["Blockly.FieldCheckbox"]
 :requires ["Blockly.Field"]}
{:file "blockly/core/field_label.js"
 :provides ["Blockly.FieldLabel"]
 :requires ["Blockly.Field" "Blockly.Tooltip" "goog.dom" "goog.math.Size"]}
{:file "blockly/core/names.js"
 :provides ["Blockly.Names"]
 :requires []}
{:file "blockly/core/mutator.js"
 :provides ["Blockly.Mutator"]
 :requires ["Blockly.Bubble" "Blockly.Icon" "Blockly.WorkspaceSvg" "goog.Timer" "goog.dom"]}
{:file "blockly/core/constants.js"
 :provides ["Blockly.constants"]
 :requires []}
{:file "blockly/core/rendered_connection.js"
 :provides ["Blockly.RenderedConnection"]
 :requires ["Blockly.Connection"]}
{:file "blockly/core/field_colour.js"
 :provides ["Blockly.FieldColour"]
 :requires ["Blockly.Field" "goog.dom" "goog.events" "goog.style" "goog.ui.ColorPicker"]}
{:file "blockly/core/field_image.js"
 :provides ["Blockly.FieldImage"]
 :requires ["Blockly.Field" "goog.dom" "goog.math.Size" "goog.userAgent"]}
{:file "blockly/core/field_variable.js"
 :provides ["Blockly.FieldVariable"]
 :requires ["Blockly.FieldDropdown" "Blockly.Msg" "Blockly.Variables" "goog.string"]}
{:file "blockly/core/input.js"
 :provides ["Blockly.Input"]
 :requires ["Blockly.Connection" "Blockly.FieldLabel" "goog.asserts"]}
{:file "blockly/core/field_number.js"
 :provides ["Blockly.FieldNumber"]
 :requires ["Blockly.FieldTextInput" "goog.math"]}
{:file "blockly/core/variables.js"
 :provides ["Blockly.Variables"]
 :requires ["Blockly.Blocks" "Blockly.Workspace" "goog.string"]}
{:file "blockly/core/workspace_svg.js"
 :provides ["Blockly.WorkspaceSvg"]
 :requires ["Blockly.ConnectionDB" "Blockly.constants" "Blockly.Options" "Blockly.ScrollbarPair" "Blockly.Trashcan" "Blockly.Workspace" "Blockly.Xml" "Blockly.ZoomControls" "goog.dom" "goog.math.Coordinate" "goog.userAgent"]}
{:file "blockly/core/bubble.js"
 :provides ["Blockly.Bubble"]
 :requires ["Blockly.Workspace" "goog.dom" "goog.math" "goog.math.Coordinate" "goog.userAgent"]}
{:file "blockly/core/procedures.js"
 :provides ["Blockly.Procedures"]
 :requires ["Blockly.Blocks" "Blockly.Field" "Blockly.Names" "Blockly.Workspace"]}
{:file "blockly/core/flyout.js"
 :provides ["Blockly.Flyout"]
 :requires ["Blockly.Block" "Blockly.Comment" "Blockly.Events" "Blockly.FlyoutButton" "Blockly.WorkspaceSvg" "goog.dom" "goog.events" "goog.math.Rect" "goog.userAgent"]}
{:file "blockly/core/xml.js"
 :provides ["Blockly.Xml"]
 :requires ["goog.asserts" "goog.dom"]}
{:file "blockly/core/blocks.js"
 :provides ["Blockly.Blocks"]
 :requires []}
{:file "blockly/core/tooltip.js"
 :provides ["Blockly.Tooltip"]
 :requires ["goog.dom" "goog.dom.TagName"]}
{:file "blockly/core/field_angle.js"
 :provides ["Blockly.FieldAngle"]
 :requires ["Blockly.FieldTextInput" "goog.math" "goog.userAgent"]}
{:file "blockly/core/zoom_controls.js"
 :provides ["Blockly.ZoomControls"]
 :requires ["goog.dom"]}
{:file "blockly/core/workspace.js"
 :provides ["Blockly.Workspace"]
 :requires ["goog.math"]}
{:file "blockly/core/field_date.js"
 :provides ["Blockly.FieldDate"]
 :requires ["Blockly.Field" "goog.date" "goog.dom" "goog.events" "goog.i18n.DateTimeSymbols" "goog.i18n.DateTimeSymbols_he" "goog.style" "goog.ui.DatePicker"]}
{:file "blockly/core/generator.js"
 :provides ["Blockly.Generator"]
 :requires ["Blockly.Block" "goog.asserts"]}
{:file "blockly/core/inject.js"
 :provides ["Blockly.inject"]
 :requires ["Blockly.Css" "Blockly.Options" "Blockly.WorkspaceSvg" "goog.dom" "goog.ui.Component" "goog.userAgent"]}
{:file "blockly/core/connection_db.js"
 :provides ["Blockly.ConnectionDB"]
 :requires ["Blockly.Connection"]}
]}
