class goog:
    @staticmethod
    def addDependency(path, provides, requires):
        print '{:file "%s"' % path[9:]
        print ' :provides [' + ' '.join('"%s"' % p for p in provides) + ']'
        print ' :requires [' + ' '.join('"%s"' % r for r in requires) + ']}'

dir = 'blockly';
goog.addDependency("../../../" + dir + "/core/warning.js", ['Blockly.Warning'], ['Blockly.Bubble', 'Blockly.Icon']);
goog.addDependency("../../../" + dir + "/core/field.js", ['Blockly.Field'], ['goog.asserts', 'goog.dom', 'goog.math.Size', 'goog.style', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/scrollbar.js", ['Blockly.Scrollbar', 'Blockly.ScrollbarPair'], ['goog.dom', 'goog.events']);
goog.addDependency("../../../" + dir + "/core/comment.js", ['Blockly.Comment'], ['Blockly.Bubble', 'Blockly.Icon', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/events.js", ['Blockly.Events'], ['goog.math.Coordinate']);
goog.addDependency("../../../" + dir + "/core/trashcan.js", ['Blockly.Trashcan'], ['goog.Timer', 'goog.dom', 'goog.math', 'goog.math.Rect']);
goog.addDependency("../../../" + dir + "/core/connection.js", ['Blockly.Connection'], ['goog.asserts', 'goog.dom']);
goog.addDependency("../../../" + dir + "/core/widgetdiv.js", ['Blockly.WidgetDiv'], ['Blockly.Css', 'goog.dom', 'goog.dom.TagName', 'goog.style']);
goog.addDependency("../../../" + dir + "/core/blockly.js", ['Blockly'], ['Blockly.BlockSvg.render', 'Blockly.Events', 'Blockly.FieldAngle', 'Blockly.FieldCheckbox', 'Blockly.FieldColour', 'Blockly.FieldDropdown', 'Blockly.FieldImage', 'Blockly.FieldTextInput', 'Blockly.FieldNumber', 'Blockly.FieldVariable', 'Blockly.Generator', 'Blockly.Msg', 'Blockly.Procedures', 'Blockly.Toolbox', 'Blockly.WidgetDiv', 'Blockly.WorkspaceSvg', 'Blockly.constants', 'Blockly.inject', 'Blockly.utils', 'goog.color', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/flyout_button.js", ['Blockly.FlyoutButton'], ['goog.dom', 'goog.math.Coordinate']);
goog.addDependency("../../../" + dir + "/core/block_render_svg.js", ['Blockly.BlockSvg.render'], ['Blockly.BlockSvg']);
goog.addDependency("../../../" + dir + "/core/utils.js", ['Blockly.utils'], ['goog.dom', 'goog.events.BrowserFeature', 'goog.math.Coordinate', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/msg.js", ['Blockly.Msg'], []);
goog.addDependency("../../../" + dir + "/core/contextmenu.js", ['Blockly.ContextMenu'], ['goog.dom', 'goog.events', 'goog.style', 'goog.ui.Menu', 'goog.ui.MenuItem']);
goog.addDependency("../../../" + dir + "/core/icon.js", ['Blockly.Icon'], ['goog.dom', 'goog.math.Coordinate']);
goog.addDependency("../../../" + dir + "/core/field_textinput.js", ['Blockly.FieldTextInput'], ['Blockly.Field', 'Blockly.Msg', 'goog.asserts', 'goog.dom', 'goog.dom.TagName', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/toolbox.js", ['Blockly.Toolbox'], ['Blockly.Flyout', 'goog.dom', 'goog.dom.TagName', 'goog.events', 'goog.events.BrowserFeature', 'goog.html.SafeHtml', 'goog.html.SafeStyle', 'goog.math.Rect', 'goog.style', 'goog.ui.tree.TreeControl', 'goog.ui.tree.TreeNode']);
goog.addDependency("../../../" + dir + "/core/options.js", ['Blockly.Options'], []);
goog.addDependency("../../../" + dir + "/core/block.js", ['Blockly.Block'], ['Blockly.Blocks', 'Blockly.Comment', 'Blockly.Connection', 'Blockly.Input', 'Blockly.Mutator', 'Blockly.Warning', 'Blockly.Workspace', 'Blockly.Xml', 'goog.array', 'goog.asserts', 'goog.math.Coordinate', 'goog.string']);
goog.addDependency("../../../" + dir + "/core/block_svg.js", ['Blockly.BlockSvg'], ['Blockly.Block', 'Blockly.ContextMenu', 'Blockly.RenderedConnection', 'goog.Timer', 'goog.asserts', 'goog.dom', 'goog.math.Coordinate', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/field_dropdown.js", ['Blockly.FieldDropdown'], ['Blockly.Field', 'goog.dom', 'goog.events', 'goog.style', 'goog.ui.Menu', 'goog.ui.MenuItem', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/css.js", ['Blockly.Css'], []);
goog.addDependency("../../../" + dir + "/core/field_checkbox.js", ['Blockly.FieldCheckbox'], ['Blockly.Field']);
goog.addDependency("../../../" + dir + "/core/field_label.js", ['Blockly.FieldLabel'], ['Blockly.Field', 'Blockly.Tooltip', 'goog.dom', 'goog.math.Size']);
goog.addDependency("../../../" + dir + "/core/names.js", ['Blockly.Names'], []);
goog.addDependency("../../../" + dir + "/core/mutator.js", ['Blockly.Mutator'], ['Blockly.Bubble', 'Blockly.Icon', 'Blockly.WorkspaceSvg', 'goog.Timer', 'goog.dom']);
goog.addDependency("../../../" + dir + "/core/constants.js", ['Blockly.constants'], []);
goog.addDependency("../../../" + dir + "/core/rendered_connection.js", ['Blockly.RenderedConnection'], ['Blockly.Connection']);
goog.addDependency("../../../" + dir + "/core/field_colour.js", ['Blockly.FieldColour'], ['Blockly.Field', 'goog.dom', 'goog.events', 'goog.style', 'goog.ui.ColorPicker']);
goog.addDependency("../../../" + dir + "/core/field_image.js", ['Blockly.FieldImage'], ['Blockly.Field', 'goog.dom', 'goog.math.Size', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/field_variable.js", ['Blockly.FieldVariable'], ['Blockly.FieldDropdown', 'Blockly.Msg', 'Blockly.Variables', 'goog.string']);
goog.addDependency("../../../" + dir + "/core/input.js", ['Blockly.Input'], ['Blockly.Connection', 'Blockly.FieldLabel', 'goog.asserts']);
goog.addDependency("../../../" + dir + "/core/field_number.js", ['Blockly.FieldNumber'], ['Blockly.FieldTextInput', 'goog.math']);
goog.addDependency("../../../" + dir + "/core/variables.js", ['Blockly.Variables'], ['Blockly.Blocks', 'Blockly.Workspace', 'goog.string']);
goog.addDependency("../../../" + dir + "/core/workspace_svg.js", ['Blockly.WorkspaceSvg'], ['Blockly.ConnectionDB', 'Blockly.constants', 'Blockly.Options', 'Blockly.ScrollbarPair', 'Blockly.Trashcan', 'Blockly.Workspace', 'Blockly.Xml', 'Blockly.ZoomControls', 'goog.dom', 'goog.math.Coordinate', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/bubble.js", ['Blockly.Bubble'], ['Blockly.Workspace', 'goog.dom', 'goog.math', 'goog.math.Coordinate', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/procedures.js", ['Blockly.Procedures'], ['Blockly.Blocks', 'Blockly.Field', 'Blockly.Names', 'Blockly.Workspace']);
goog.addDependency("../../../" + dir + "/core/flyout.js", ['Blockly.Flyout'], ['Blockly.Block', 'Blockly.Comment', 'Blockly.Events', 'Blockly.FlyoutButton', 'Blockly.WorkspaceSvg', 'goog.dom', 'goog.events', 'goog.math.Rect', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/xml.js", ['Blockly.Xml'], ['goog.asserts', 'goog.dom']);
goog.addDependency("../../../" + dir + "/core/blocks.js", ['Blockly.Blocks'], []);
goog.addDependency("../../../" + dir + "/core/tooltip.js", ['Blockly.Tooltip'], ['goog.dom', 'goog.dom.TagName']);
goog.addDependency("../../../" + dir + "/core/field_angle.js", ['Blockly.FieldAngle'], ['Blockly.FieldTextInput', 'goog.math', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/zoom_controls.js", ['Blockly.ZoomControls'], ['goog.dom']);
goog.addDependency("../../../" + dir + "/core/workspace.js", ['Blockly.Workspace'], ['goog.math']);
goog.addDependency("../../../" + dir + "/core/field_date.js", ['Blockly.FieldDate'], ['Blockly.Field', 'goog.date', 'goog.dom', 'goog.events', 'goog.i18n.DateTimeSymbols', 'goog.i18n.DateTimeSymbols_he', 'goog.style', 'goog.ui.DatePicker']);
goog.addDependency("../../../" + dir + "/core/generator.js", ['Blockly.Generator'], ['Blockly.Block', 'goog.asserts']);
goog.addDependency("../../../" + dir + "/core/inject.js", ['Blockly.inject'], ['Blockly.Css', 'Blockly.Options', 'Blockly.WorkspaceSvg', 'goog.dom', 'goog.ui.Component', 'goog.userAgent']);
goog.addDependency("../../../" + dir + "/core/connection_db.js", ['Blockly.ConnectionDB'], ['Blockly.Connection']);

