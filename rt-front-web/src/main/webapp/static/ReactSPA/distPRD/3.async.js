(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[3],{j7ow:function(e,t,a){"use strict";var n=a("TqRt"),l=a("284h");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("g9YV");var i,r,o=n(a("wCAj")),c=n(a("MVZn")),d=n(a("lwsE")),u=n(a("W8MJ")),f=n(a("a1gu")),s=n(a("Nsbk")),m=n(a("7W2i")),p=l(a("q1tI")),E=a("MuoO"),y=n(a("xNx2")),v=a("P9HM"),h=a("uI15"),b={display:"inline-block",float:"left",color:"#AAA"},g=(i=(0,E.connect)(function(e){var t=e.operation;return{operation:t}}),i(r=function(e){function t(){var e,a;(0,d.default)(this,t);for(var n=arguments.length,l=new Array(n),i=0;i<n;i++)l[i]=arguments[i];return a=(0,f.default)(this,(e=(0,s.default)(t)).call.apply(e,[this].concat(l))),a.handleDblClick=function(e){var t=a.props.dispatch,n={symbol:e.symbol,exchange:e.exchange,gatewayID:e.gatewayID};t({type:"operation/subscribe",payload:n})},a.handleClick=function(e){var t=a.props.updateTradeForm;null!==t&&void 0!==t&&t({symbol:e.symbol})},a}return(0,m.default)(t,e),(0,u.default)(t,[{key:"render",value:function(){var e,t,a=this,n=this.props,l=n.list,i=n.pagination,r=n.scroll,d=n.bordered;e=void 0!==i&&i,t=void 0===d||d;var u=[];void 0!==l&&l.sort(h.sortBySymbol).forEach(function(e){var t=e;t.priceDiff=e.positionProfit/e.contractSize/e.position,t.lastPrice=e.price+t.priceDiff,t.direction===v.DIRECTION_LONG||t.position>0&&t.direction===v.DIRECTION_NET?(t.lastPrice=t.price+t.priceDiff,t.openPriceDiff=t.lastPrice-e.openPrice,t.openProfit=t.openPriceDiff*e.position*e.contractSize):(t.direction===v.DIRECTION_SHORT||t.position<0&&t.direction===v.DIRECTION_NET)&&(t.lastPrice=t.price-t.priceDiff,t.openPriceDiff=e.openPrice-t.lastPrice,t.openProfit=t.openPriceDiff*e.position*e.contractSize),t.contractValue=(t.openPrice+t.openPriceDiff)*e.contractSize*e.position,0!==e.useMargin?(t.positionProfitRatio=t.positionProfit/e.useMargin,t.openProfitRatio=t.openProfit/e.useMargin):(t.positionProfitRatio=0,t.openProfitRatio=0),t.tdFrozen=e.frozen-e.ydFrozen,t.tdPosition=e.position-e.ydPosition,u.push(t)});var f={y:250,x:1460};void 0!==r&&(f=(0,c.default)({},f,r));var s=new Set,m=new Set;u.forEach(function(e){s.add(e.rtSymbol),m.add("".concat(e.gatewayDisplayName,"(").concat(e.gatewayID,")?"))});var E=[];Array.from(s).forEach(function(e){E.push({text:e,value:e})});var g=[];Array.from(m).forEach(function(e){g.push({text:e,value:e})});var P=[{title:"\u4ea7\u54c1",dataIndex:"rtSymbol",width:150,key:"rtSymbol",sorter:function(e,t){return e.rtSymbol>t.rtSymbol},filters:E,onFilter:function(e,t){return t.rtSymbol===e},render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.cursorPointer)},p.default.createElement("div",{className:"".concat(y.default.colorYellow)},t.rtSymbol,p.default.createElement("br",null)),p.default.createElement("div",null,t.contractName))}},{title:"\u8d26\u6237",dataIndex:"gatewayDisplayName",width:180,filters:g,onFilter:function(e,t){return"".concat(t.gatewayDisplayName,"(").concat(t.gatewayID,")?")===e},render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight)},p.default.createElement("div",null,t.accountID,p.default.createElement("br",null)),p.default.createElement("div",{style:{color:"#BBB"}},t.gatewayDisplayName))}},{title:"\u65b9\u5411",dataIndex:"direction",width:60,render:function(e,t){return v.DIRECTION_LONG===t.direction?p.default.createElement("span",{className:"".concat(y.default.colorBuy," ").concat(y.default.displayCenter)},v.DIRECTION_TRANSLATER.get(t.direction)):v.DIRECTION_SHORT===t.direction?p.default.createElement("span",{className:"".concat(y.default.colorSell," ").concat(y.default.displayCenter)},v.DIRECTION_TRANSLATER.get(t.direction)):p.default.createElement("span",{style:"".concat(y.default.displayCenter)},v.DIRECTION_TRANSLATER.get(t.direction))}},{title:"\u6301\u4ed3",dataIndex:"position",width:120,align:"right",render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorCount)},p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u6301\u4ed3\uff1a"),t.position,p.default.createElement("br",null)),p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u51bb\u7ed3\uff1a"),t.frozen))}},{title:"\u4eca\u4ed3",dataIndex:"tdPosition",width:120,align:"right",render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorCount)},p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u6301\u4ed3\uff1a"),t.tdPosition,p.default.createElement("br",null)),p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u51bb\u7ed3\uff1a"),t.tdFrozen))}},{title:"\u5747\u4ef7",dataIndex:"price",width:150,align:"right",render:function(e,t){return p.default.createElement("div",{className:" ".concat(y.default.displayRight)},p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u6301\u4ed3\uff1a"),(0,h.numberFormat)(t.price,4),p.default.createElement("br",null)),p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u5f00\u4ed3\uff1a"),(0,h.numberFormat)(t.openPrice,4)))}},{title:"\u76c8\u5229\u4ef7\u5dee",dataIndex:"priceDiff",width:120,align:"right",render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight)},p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u6301\u4ed3\uff1a"),(0,h.numberFormat)(t.priceDiff,4),p.default.createElement("br",null)),p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u5f00\u4ed3\uff1a"),(0,h.numberFormat)(t.openPriceDiff,4)))}},{title:"\u9010\u7b14\u6d6e\u76c8",dataIndex:"openProfit",width:120,align:"right",render:function(e,t){return t.openProfit>0?p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorBuy)},p.default.createElement("div",null,(0,h.numberFormat)(t.openProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.openProfitRatio,2),"%")):t.openProfit<0?p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorSell)},p.default.createElement("div",null,(0,h.numberFormat)(t.openProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.openProfitRatio,2),"%")):p.default.createElement("div",{className:"".concat(y.default.displayRight)},p.default.createElement("div",null,(0,h.numberFormat)(t.openProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.openProfitRatio,2),"%"))}},{title:"\u76ef\u5e02\u6d6e\u76c8",dataIndex:"positionProfit",width:120,align:"right",render:function(e,t){return t.positionProfit>0?p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorBuy)},p.default.createElement("div",null,(0,h.numberFormat)(t.positionProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.positionProfitRatio,2),"%")):t.positionProfit<0?p.default.createElement("div",{className:"".concat(y.default.displayRight," ").concat(y.default.colorSell)},p.default.createElement("div",null,(0,h.numberFormat)(t.positionProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.positionProfitRatio,2),"%")):p.default.createElement("div",{className:"".concat(y.default.displayRight)},p.default.createElement("div",null,(0,h.numberFormat)(t.positionProfit,4),p.default.createElement("br",null)),p.default.createElement("div",null,(0,h.numberFormat)(100*t.positionProfitRatio,2),"%"))}},{title:"\u4fdd\u8bc1\u91d1",dataIndex:"margin",width:150,align:"right",render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight)},p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u7ecf\u6d4e\u5546\uff1a"),(0,h.numberFormat)(t.useMargin,2),p.default.createElement("br",null)),p.default.createElement("div",null,p.default.createElement("span",{style:b},"\u4ea4\u6613\u6240\uff1a"),(0,h.numberFormat)(t.exchangeMargin,2)))}},{title:"\u5408\u7ea6\u4ef7\u503c",dataIndex:"contractValue",width:150,align:"right",render:function(e,t){return p.default.createElement("div",{className:"".concat(y.default.displayRight)},(0,h.numberFormat)(t.contractValue,2))}}];return p.default.createElement(o.default,{onRow:function(e){return{onDoubleClick:function(){return a.handleDblClick(e)},onClick:function(){return a.handleClick(e)}}},rowKey:"rtPositionID",size:"small",columns:P,dataSource:u,pagination:e,scroll:f,bordered:t})}}]),t}(p.PureComponent))||r),P=g;t.default=P},jtBG:function(e,t,a){"use strict";var n=a("TqRt"),l=a("284h");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var i,r,o=n(a("lwsE")),c=n(a("W8MJ")),d=n(a("a1gu")),u=n(a("Nsbk")),f=n(a("7W2i")),s=l(a("q1tI")),m=a("MuoO"),p=n(a("j7ow")),E=(i=(0,m.connect)(function(e){var t=e.position,a=e.tick,n=e.basicTradeForm;return{position:t,tick:a,basicTradeForm:n}}),i(r=function(e){function t(e){var a;return(0,o.default)(this,t),a=(0,d.default)(this,(0,u.default)(t).call(this,e)),a.onWindowResize=function(){a.setState({tableHeight:(window.innerHeight-320>520?window.innerHeight-320:520)||520})},a.componentDidMount=function(){var e=a.props.dispatch;e({type:"position/fetchPositions",payload:{}}),window.addEventListener("resize",a.onWindowResize)},a.componentWillUnmount=function(){window.removeEventListener("resize",a.onWindowResize)},a.updateTradeForm=function(e){var t=e.symbol,n=a.props,l=n.basicTradeForm,i=n.dispatch,r=n.tick;i({type:"basicTradeForm/update",payload:{fuzzySymbol:t}}),null!=l.form&&void 0!==l.form&&l.form.setFieldsValue({fuzzySymbol:t}),i({type:"basicTradeForm/updateTick",payload:r.ticks})},a.state={tableHeight:(window.innerHeight-320>520?window.innerHeight-320:520)||520},a}return(0,f.default)(t,e),(0,c.default)(t,[{key:"render",value:function(){var e=this.props.position,t=this.state.tableHeight;return s.default.createElement(p.default,{updateTradeForm:this.updateTradeForm,scroll:{y:t},pagination:{pageSize:50},list:e.positions})}}]),t}(s.PureComponent))||r),y=E;t.default=y}}]);