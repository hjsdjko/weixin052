(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-login-login"],{3285:function(t,n,e){"use strict";e.r(n);var i=e("6263"),r=e.n(i);for(var a in i)"default"!==a&&function(t){e.d(n,t,(function(){return i[t]}))}(a);n["default"]=r.a},"33cc":function(t,n,e){"use strict";var i=e("99ac"),r=e.n(i);r.a},"4af2":function(t,n,e){var i=e("24fb");n=i(!1),n.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-3269dab4]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),t.exports=n},6263:function(t,n,e){"use strict";var i=e("4ea4");Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0,e("96cf");var r=i(e("3b8d")),a=i(e("2971")),s={data:function(){return{username:"",password:"",loginType:1,codes:[{num:1,color:"#000",rotate:"10deg",size:"16px"},{num:2,color:"#000",rotate:"10deg",size:"16px"},{num:3,color:"#000",rotate:"10deg",size:"16px"},{num:4,color:"#000",rotate:"10deg",size:"16px"}],options:["请选择登录用户类型"],optionsValues:["","yonghu"],index:1,roleNum:0}},onLoad:function(){var t=["请选择登录用户类型"],n=a.default.list();this.menuList=n;for(var e=0;e<this.menuList.length;e++)"是"==this.menuList[e].hasFrontLogin&&(t.push(this.menuList[e].roleName),this.roleNum++);1==this.roleNum&&(this.index=1),this.options=t,this.styleChange()},methods:{styleChange:function(){this.$nextTick((function(){}))},onRegisterTap:function(t){uni.setStorageSync("loginTable",t),this.$utils.jump("../register/register")},onLoginTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.username){t.next=3;break}return this.$utils.msg("请输入用户名"),t.abrupt("return");case 3:if(this.password){t.next=6;break}return this.$utils.msg("请输入用户密码"),t.abrupt("return");case 6:if(this.optionsValues[this.index]){t.next=9;break}return this.$utils.msg("请选择登录用户类型"),t.abrupt("return");case 9:return t.next=11,this.$api.login("".concat(this.optionsValues[this.index]),{username:this.username,password:this.password});case 11:return n=t.sent,uni.removeStorageSync("useridTag"),uni.setStorageSync("token",n.token),uni.setStorageSync("nickname",this.username),uni.setStorageSync("nowTable","".concat(this.optionsValues[this.index])),t.next=18,this.$api.session("".concat(this.optionsValues[this.index]));case 18:n=t.sent,n.data.touxiang?uni.setStorageSync("headportrait",n.data.touxiang):n.data.headportrait&&uni.setStorageSync("headportrait",n.data.headportrait),uni.setStorageSync("userid",n.data.id),n.data.vip&&uni.setStorageSync("vip",n.data.vip),uni.setStorageSync("appRole","".concat(this.options[this.index])),this.$utils.tab("../index/index");case 24:case"end":return t.stop()}}),t,this)})));function n(){return t.apply(this,arguments)}return n}(),optionsChange:function(t){this.index=t.target.value}}};n.default=s},"74d0":function(t,n,e){"use strict";var i,r=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"box",style:{minHeight:"100vh",width:"100%",padding:"160rpx 44rpx 244rpx 44rpx",background:"url(http://clfile.zggen.cn/20231130/51b25124d35a4e059579e6c84f9948aa.jpg) no-repeat center top / 100%,#ffffff",height:"100%"}},[e("v-uni-view",{style:{padding:"48rpx 48rpx 48rpx 48rpx",boxShadow:"0px 0px 12rpx #dddddd",margin:"0 0 244rpx 0",borderRadius:"4rpx",background:"#ffffff",display:"block",width:"100%",position:"relative",height:"auto"}},[e("v-uni-image",{style:{width:"160rpx",margin:"0 0 40rpx 0",borderRadius:"100%",objectFit:"cover",display:"none",height:"160rpx"},attrs:{src:"http://clfile.zggen.cn/20231027/4b7b24d658fd400e849c8c2314e29d56.jpg",mode:"aspectFill"}}),1==t.loginType?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 24rpx 0",borderRadius:"40rpx",background:"#00000040",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{border:"2rpx solid #00000010",padding:"0px 24rpx 0 24rpx",margin:"0 0 0 0",color:"#999999",borderRadius:"0px",background:"#ffffff",width:"100%",fontSize:"28rpx",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"请输入账号"},model:{value:t.username,callback:function(n){t.username=n},expression:"username"}})],1):t._e(),1==t.loginType?e("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 24rpx 0",borderRadius:"40rpx",background:"#00000040",height:"auto"}},[e("v-uni-input",{staticClass:"uni-input",style:{border:"2rpx solid #00000010",padding:"0px 24rpx 0 24rpx",margin:"0 0 0 0",color:"#999999",borderRadius:"0px",background:"#ffffff",width:"100%",fontSize:"28rpx",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"请输入密码"},model:{value:t.password,callback:function(n){t.password=n},expression:"password"}})],1):t._e(),t.roleNum>1?e("v-uni-picker",{style:{border:"2rpx solid #00000010",padding:"0 20rpx",margin:"0 0 24rpx 0",borderRadius:"0px",background:"#ffffff",width:"100%",height:"auto"},attrs:{value:t.index,range:t.options},on:{change:function(n){arguments[0]=n=t.$handleEvent(n),t.optionsChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-picker-type",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#999999"}},[t._v(t._s(t.options[t.index]))])],1):t._e(),1==t.loginType?e("v-uni-button",{staticClass:"btn-submit",style:{border:"2rpx solid #dddddd",padding:"0 0 0 0",margin:"0 0 24rpx 0",color:"#333",borderRadius:"0px",background:"#fff000",width:"100%",lineHeight:"80rpx",fontSize:"32rpx",height:"80rpx"},attrs:{type:"primary"},on:{click:function(n){arguments[0]=n=t.$handleEvent(n),t.onLoginTap.apply(void 0,arguments)}}},[t._v("登录")]):t._e(),2==t.loginType?e("v-uni-button",{staticClass:"btn-submit",style:{border:"2rpx solid #dddddd",padding:"0 0 0 0",margin:"0 0 24rpx 0",color:"#333",borderRadius:"0px",background:"#fff000",width:"100%",lineHeight:"80rpx",fontSize:"32rpx",height:"80rpx"},attrs:{type:"primary"},on:{click:function(n){arguments[0]=n=t.$handleEvent(n),t.onFaceLoginTap.apply(void 0,arguments)}}},[t._v("人脸识别登录")]):t._e(),e("v-uni-view",{staticClass:"links",style:{width:"100%",margin:"0 0 24rpx 0",flexWrap:"wrap",display:"flex",height:"auto"}},[e("v-uni-view",{staticClass:"link-highlight",style:{color:"#999999",padding:"0 8rpx 0 8rpx",fontSize:"28rpx"},on:{click:function(n){arguments[0]=n=t.$handleEvent(n),t.onRegisterTap("yonghu")}}},[t._v("注册用户")])],1)],1)],1)],1)},a=[];e.d(n,"b",(function(){return r})),e.d(n,"c",(function(){return a})),e.d(n,"a",(function(){return i}))},"99ac":function(t,n,e){var i=e("4af2");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var r=e("4f06").default;r("6b5b2b8d",i,!0,{sourceMap:!1,shadowMode:!1})},a86a:function(t,n,e){"use strict";e.r(n);var i=e("74d0"),r=e("3285");for(var a in r)"default"!==a&&function(t){e.d(n,t,(function(){return r[t]}))}(a);e("33cc");var s,o=e("f0c5"),u=Object(o["a"])(r["default"],i["b"],i["c"],!1,null,"3269dab4",null,!1,i["a"],s);n["default"]=u.exports}}]);