package idea.jsbeautify.js

val BeautifyJs = """
!function(){var e=function(e){var t={};function n(r){if(t[r])return t[r].exports;var i=t[r]={i:r,l:!1,exports:{}};return e[r].call(i.exports,i,i.exports,n),i.l=!0,i.exports}return n.m=e,n.c=t,n.i=function(e){return e},n.d=function(e,t,r){n.o(e,t)||Object.defineProperty(e,t,{configurable:!1,enumerable:!0,get:r})},n.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return n.d(t,"a",t),t},n.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},n.p="",n(n.s=6)}([function(e,t){var n="ªµºÀ-ÖØ-öø-ˁˆ-ˑˠ-ˤˬˮͰ-ʹͶͷͺ-ͽΆΈ-ΊΌΎ-ΡΣ-ϵϷ-ҁҊ-ԧԱ-Ֆՙա-ևא-תװ-ײؠ-يٮٯٱ-ۓەۥۦۮۯۺ-ۼۿܐܒ-ܯݍ-ޥޱߊ-ߪߴߵߺࠀ-ࠕࠚࠤࠨࡀ-ࡘࢠࢢ-ࢬऄ-हऽॐक़-ॡॱ-ॷॹ-ॿঅ-ঌএঐও-নপ-রলশ-হঽৎড়ঢ়য়-ৡৰৱਅ-ਊਏਐਓ-ਨਪ-ਰਲਲ਼ਵਸ਼ਸਹਖ਼-ੜਫ਼ੲ-ੴઅ-ઍએ-ઑઓ-નપ-રલળવ-હઽૐૠૡଅ-ଌଏଐଓ-ନପ-ରଲଳଵ-ହଽଡ଼ଢ଼ୟ-ୡୱஃஅ-ஊஎ-ஐஒ-கஙசஜஞடணதந-பம-ஹௐఅ-ఌఎ-ఐఒ-నప-ళవ-హఽౘౙౠౡಅ-ಌಎ-ಐಒ-ನಪ-ಳವ-ಹಽೞೠೡೱೲഅ-ഌഎ-ഐഒ-ഺഽൎൠൡൺ-ൿඅ-ඖක-නඳ-රලව-ෆก-ะาำเ-ๆກຂຄງຈຊຍດ-ທນ-ຟມ-ຣລວສຫອ-ະາຳຽເ-ໄໆໜ-ໟༀཀ-ཇཉ-ཬྈ-ྌက-ဪဿၐ-ၕၚ-ၝၡၥၦၮ-ၰၵ-ႁႎႠ-ჅჇჍა-ჺჼ-ቈቊ-ቍቐ-ቖቘቚ-ቝበ-ኈኊ-ኍነ-ኰኲ-ኵኸ-ኾዀዂ-ዅወ-ዖዘ-ጐጒ-ጕጘ-ፚᎀ-ᎏᎠ-Ᏼᐁ-ᙬᙯ-ᙿᚁ-ᚚᚠ-ᛪᛮ-ᛰᜀ-ᜌᜎ-ᜑᜠ-ᜱᝀ-ᝑᝠ-ᝬᝮ-ᝰក-ឳៗៜᠠ-ᡷᢀ-ᢨᢪᢰ-ᣵᤀ-ᤜᥐ-ᥭᥰ-ᥴᦀ-ᦫᧁ-ᧇᨀ-ᨖᨠ-ᩔᪧᬅ-ᬳᭅ-ᭋᮃ-ᮠᮮᮯᮺ-ᯥᰀ-ᰣᱍ-ᱏᱚ-ᱽᳩ-ᳬᳮ-ᳱᳵᳶᴀ-ᶿḀ-ἕἘ-Ἕἠ-ὅὈ-Ὅὐ-ὗὙὛὝὟ-ώᾀ-ᾴᾶ-ᾼιῂ-ῄῆ-ῌῐ-ΐῖ-Ίῠ-Ῥῲ-ῴῶ-ῼⁱⁿₐ-ₜℂℇℊ-ℓℕℙ-ℝℤΩℨK-ℭℯ-ℹℼ-ℿⅅ-ⅉⅎⅠ-ↈⰀ-Ⱞⰰ-ⱞⱠ-ⳤⳫ-ⳮⳲⳳⴀ-ⴥⴧⴭⴰ-ⵧⵯⶀ-ⶖⶠ-ⶦⶨ-ⶮⶰ-ⶶⶸ-ⶾⷀ-ⷆⷈ-ⷎⷐ-ⷖⷘ-ⷞⸯ々-〇〡-〩〱-〵〸-〼ぁ-ゖゝ-ゟァ-ヺー-ヿㄅ-ㄭㄱ-ㆎㆠ-ㆺㇰ-ㇿ㐀-䶵一-鿌ꀀ-ꒌꓐ-ꓽꔀ-ꘌꘐ-ꘟꘪꘫꙀ-ꙮꙿ-ꚗꚠ-ꛯꜗ-ꜟꜢ-ꞈꞋ-ꞎꞐ-ꞓꞠ-Ɦꟸ-ꠁꠃ-ꠅꠇ-ꠊꠌ-ꠢꡀ-ꡳꢂ-ꢳꣲ-ꣷꣻꤊ-ꤥꤰ-ꥆꥠ-ꥼꦄ-ꦲꧏꨀ-ꨨꩀ-ꩂꩄ-ꩋꩠ-ꩶꩺꪀ-ꪯꪱꪵꪶꪹ-ꪽꫀꫂꫛ-ꫝꫠ-ꫪꫲ-ꫴꬁ-ꬆꬉ-ꬎꬑ-ꬖꬠ-ꬦꬨ-ꬮꯀ-ꯢ가-힣ힰ-ퟆퟋ-ퟻ豈-舘並-龎ﬀ-ﬆﬓ-ﬗיִײַ-ﬨשׁ-זּטּ-לּמּנּסּףּפּצּ-ﮱﯓ-ﴽﵐ-ﶏﶒ-ﷇﷰ-ﷻﹰ-ﹴﹶ-ﻼＡ-Ｚａ-ｚｦ-ﾾￂ-ￇￊ-ￏￒ-ￗￚ-ￜ",r=new RegExp("["+n+"]"),i=new RegExp("["+n+"̀-ͯ҃-֑҇-ׇֽֿׁׂׅׄؐ-ؚؠ-ىٲ-ۓۧ-ۨۻ-ۼܰ-݊ࠀ-ࠔࠛ-ࠣࠥ-ࠧࠩ-࠭ࡀ-ࡗࣤ-ࣾऀ-ःऺ-़ा-ॏ॑-ॗॢ-ॣ०-९ঁ-ঃ়া-ৄেৈৗয়-ৠਁ-ਃ਼ਾ-ੂੇੈੋ-੍ੑ੦-ੱੵઁ-ઃ઼ા-ૅે-ૉો-્ૢ-ૣ૦-૯ଁ-ଃ଼ା-ୄେୈୋ-୍ୖୗୟ-ୠ୦-୯ஂா-ூெ-ைொ-்ௗ௦-௯ఁ-ఃె-ైొ-్ౕౖౢ-ౣ౦-౯ಂಃ಼ಾ-ೄೆ-ೈೊ-್ೕೖೢ-ೣ೦-೯ംഃെ-ൈൗൢ-ൣ൦-൯ංඃ්ා-ුූෘ-ෟෲෳิ-ฺเ-ๅ๐-๙ິ-ູ່-ໍ໐-໙༘༙༠-༩༹༵༷ཁ-ཇཱ-྄྆-྇ྍ-ྗྙ-ྼ࿆က-ဩ၀-၉ၧ-ၭၱ-ၴႂ-ႍႏ-ႝ፝-፟ᜎ-ᜐᜠ-ᜰᝀ-ᝐᝲᝳក-ឲ៝០-៩᠋-᠍᠐-᠙ᤠ-ᤫᤰ-᤻ᥑ-ᥭᦰ-ᧀᧈ-ᧉ᧐-᧙ᨀ-ᨕᨠ-ᩓ᩠-᩿᩼-᪉᪐-᪙ᭆ-ᭋ᭐-᭙᭫-᭳᮰-᮹᯦-᯳ᰀ-ᰢ᱀-᱉ᱛ-ᱽ᳐-᳒ᴀ-ᶾḁ-ἕ‌‍‿⁀⁔⃐-⃥⃜⃡-⃰ⶁ-ⶖⷠ-ⷿ〡-〨゙゚Ꙁ-ꙭꙴ-꙽ꚟ꛰-꛱ꟸ-ꠀ꠆ꠋꠣ-ꠧꢀ-ꢁꢴ-꣄꣐-꣙ꣳ-ꣷ꤀-꤉ꤦ-꤭ꤰ-ꥅꦀ-ꦃ꦳-꧀ꨀ-ꨧꩀ-ꩁꩌ-ꩍ꩐-꩙ꩻꫠ-ꫩꫲ-ꫳꯀ-ꯡ꯬꯭꯰-꯹ﬠ-ﬨ︀-️︠-︦︳︴﹍-﹏０-９＿]");t.newline=/[\n\r\u2028\u2029]/,t.lineBreak=new RegExp("\r\n|"+t.newline.source),t.allLineBreaks=new RegExp(t.lineBreak.source,"g"),t.isIdentifierStart=function(e){return e<65?36===e||64===e:e<91||(e<97?95===e:e<123||e>=170&&r.test(String.fromCharCode(e)))},t.isIdentifierChar=function(e){return e<48?36===e:e<58||!(e<65)&&(e<91||(e<97?95===e:e<123||e>=170&&i.test(String.fromCharCode(e))))}},function(e,t,n){var r=n(3).mergeOpts,i=n(0),_=n(4).Output,a=n(7).Tokenizer;function o(e,t){if(!t.multiline_frame&&t.mode!==f.ForInitializer&&t.mode!==f.Conditional){var n=t.start_line_index;e.remove_indent(n)}}function s(e,t){for(var n=0;n<t.length;n+=1)if(t[n]===e)return!0;return!1}var l=["before-newline","after-newline","preserve-newline"],c=function(e){for(var t={},n=0;n<e.length;n++)t[e[n].replace(/-/g,"_")]=e[n];return t}(l),p=[c.before_newline,c.preserve_newline],f={BlockStatement:"BlockStatement",Statement:"Statement",ObjectLiteral:"ObjectLiteral",ArrayLiteral:"ArrayLiteral",ForInitializer:"ForInitializer",Conditional:"Conditional",Expression:"Expression"};e.exports.Beautifier=function(e,t){"use strict";var n,d,u,h,T,E,x,R,K,m,b,v,k,w=[],O="";function S(e,t){var r=0;return e&&(r=e.indentation_level,!n.just_added_newline()&&e.line_indent_level>r&&(r=e.line_indent_level)),{mode:t,parent:e,last_text:e?e.last_text:"",last_word:e?e.last_word:"",declaration_statement:!1,declaration_assignment:!1,multiline_frame:!1,inline_frame:!1,if_block:!1,else_block:!1,do_block:!1,do_while:!1,import_block:!1,in_case_statement:!1,in_case:!1,case_body:!1,indentation_level:r,line_indent_level:e?e.line_indent_level:r,start_line_index:n.get_line_number(),ternary_depth:0}}v={TK_START_EXPR:function(){z()||A(h);var e=f.Expression;if("["===h.text){if("TK_WORD"===T||")"===R.last_text)return"TK_RESERVED"===T&&s(R.last_text,u.line_starters)&&(n.space_before_token=!0),M(e),P(),B(),void(k.space_in_paren&&(n.space_before_token=!0));e=f.ArrayLiteral,I(R.mode)&&("["!==R.last_text&&(","!==R.last_text||"]"!==E&&"}"!==E)||k.keep_array_indentation||L())}else"TK_RESERVED"===T&&"for"===R.last_text?e=f.ForInitializer:"TK_RESERVED"===T&&s(R.last_text,["if","while"])&&(e=f.Conditional);";"===R.last_text||"TK_START_BLOCK"===T?L():"TK_END_EXPR"===T||"TK_START_EXPR"===T||"TK_END_BLOCK"===T||"."===R.last_text?N(h.wanted_newline):"TK_RESERVED"===T&&"("===h.text||"TK_WORD"===T||"TK_OPERATOR"===T?"TK_RESERVED"===T&&("function"===R.last_word||"typeof"===R.last_word)||"*"===R.last_text&&(s(E,["function","yield"])||R.mode===f.ObjectLiteral&&s(E,["{",","]))?k.space_after_anon_function&&(n.space_before_token=!0):"TK_RESERVED"!==T||!s(R.last_text,u.line_starters)&&"catch"!==R.last_text||k.space_before_conditional&&(n.space_before_token=!0):n.space_before_token=!0,"("===h.text&&"TK_RESERVED"===T&&s(R.last_word,["await","async"])&&(n.space_before_token=!0),"("===h.text&&("TK_EQUALS"!==T&&"TK_OPERATOR"!==T||X()||N()),"("===h.text&&"TK_WORD"!==T&&"TK_RESERVED"!==T&&N(),M(e),P(),k.space_in_paren&&(n.space_before_token=!0),B()},TK_END_EXPR:function(){for(;R.mode===f.Statement;)W();A(h),R.multiline_frame&&N("]"===h.text&&I(R.mode)&&!k.keep_array_indentation),k.space_in_paren&&("TK_START_EXPR"!==T||k.space_in_empty_paren?n.space_before_token=!0:(n.trim(),n.space_before_token=!1)),"]"===h.text&&k.keep_array_indentation?(P(),W()):(W(),P()),o(n,K),R.do_while&&K.mode===f.Conditional&&(K.mode=f.Expression,R.do_block=!1,R.do_while=!1)},TK_START_BLOCK:function(){A(h);var e=U(1),t=U(2);t&&(s(t.text,[":",","])&&s(e.type,["TK_STRING","TK_WORD","TK_RESERVED"])||s(e.text,["get","set","..."])&&s(t.type,["TK_WORD","TK_RESERVED"]))?s(E,["class","interface"])?M(f.BlockStatement):M(f.ObjectLiteral):"TK_OPERATOR"===T&&"=>"===R.last_text?M(f.BlockStatement):s(T,["TK_EQUALS","TK_START_EXPR","TK_COMMA","TK_OPERATOR"])||"TK_RESERVED"===T&&s(R.last_text,["return","throw","import","default"])?M(f.ObjectLiteral):M(f.BlockStatement);var r=!e.comments_before.length&&"}"===e.text&&"function"===R.last_word&&"TK_END_EXPR"===T;if(k.brace_preserve_inline){var i=0,_=null;R.inline_frame=!0;do{if((_=U(i+=1)).wanted_newline){R.inline_frame=!1;break}}while("TK_EOF"!==_.type&&("TK_END_BLOCK"!==_.type||_.opened!==h))}("expand"===k.brace_style||"none"===k.brace_style&&h.wanted_newline)&&!R.inline_frame?"TK_OPERATOR"!==T&&(r||"TK_EQUALS"===T||"TK_RESERVED"===T&&F(R.last_text)&&"else"!==R.last_text)?n.space_before_token=!0:L(!1,!0):(!I(K.mode)||"TK_START_EXPR"!==T&&"TK_COMMA"!==T||(("TK_COMMA"===T||k.space_in_paren)&&(n.space_before_token=!0),("TK_COMMA"===T||"TK_START_EXPR"===T&&R.inline_frame)&&(N(),K.multiline_frame=K.multiline_frame||R.multiline_frame,R.multiline_frame=!1)),"TK_OPERATOR"!==T&&"TK_START_EXPR"!==T&&("TK_START_BLOCK"!==T||R.inline_frame?n.space_before_token=!0:L())),P(),B()},TK_END_BLOCK:function(){for(A(h);R.mode===f.Statement;)W();var e="TK_START_BLOCK"===T;R.inline_frame&&!e?n.space_before_token=!0:"expand"===k.brace_style?e||L():e||(I(R.mode)&&k.keep_array_indentation?(k.keep_array_indentation=!1,L(),k.keep_array_indentation=!0):L()),W(),P()},TK_WORD:Q,TK_RESERVED:Q,TK_SEMICOLON:function(){z()?n.space_before_token=!1:A(h);for(var e=U(1);!(R.mode!==f.Statement||R.if_block&&e&&"TK_RESERVED"===e.type&&"else"===e.text||R.do_block);)W();R.import_block&&(R.import_block=!1),P()},TK_STRING:function(){z()?n.space_before_token=!0:(A(h),"TK_RESERVED"===T||"TK_WORD"===T||R.inline_frame?n.space_before_token=!0:"TK_COMMA"===T||"TK_START_EXPR"===T||"TK_EQUALS"===T||"TK_OPERATOR"===T?X()||N():L()),P()},TK_EQUALS:function(){z()||A(h),R.declaration_statement&&(R.declaration_assignment=!0),n.space_before_token=!0,P(),n.space_before_token=!0},TK_OPERATOR:function(){var e="*"===h.text&&("TK_RESERVED"===T&&s(R.last_text,["function","yield"])||s(T,["TK_START_BLOCK","TK_COMMA","TK_END_BLOCK","TK_SEMICOLON"])),t=s(h.text,["-","+"])&&(s(T,["TK_START_BLOCK","TK_START_EXPR","TK_EQUALS","TK_OPERATOR"])||s(R.last_text,u.line_starters)||","===R.last_text);if(z());else{var r=!e;A(h,r)}if("TK_RESERVED"===T&&F(R.last_text))return n.space_before_token=!0,void P();if("*"!==h.text||"TK_DOT"!==T)if("::"!==h.text){if("TK_OPERATOR"===T&&s(k.operator_position,p)&&N(),":"===h.text&&R.in_case)return R.case_body=!0,B(),P(),L(),void(R.in_case=!1);var i=!0,_=!0,a=!1;if(":"===h.text?0===R.ternary_depth?i=!1:(R.ternary_depth-=1,a=!0):"?"===h.text&&(R.ternary_depth+=1),!t&&!e&&k.preserve_newlines&&s(h.text,u.positionable_operators)){var o=":"===h.text,l=o&&a,d=o&&!a;switch(k.operator_position){case c.before_newline:return n.space_before_token=!d,P(),o&&!l||N(),void(n.space_before_token=!0);case c.after_newline:return n.space_before_token=!0,!o||l?U(1).wanted_newline?L(!1,!0):N():n.space_before_token=!1,P(),void(n.space_before_token=!0);case c.preserve_newline:return d||N(),i=!(n.just_added_newline()||d),n.space_before_token=i,P(),void(n.space_before_token=!0)}}if(e){N(),i=!1;var E=U(1);_=E&&s(E.type,["TK_WORD","TK_RESERVED"])}else"..."===h.text?(N(),i="TK_START_BLOCK"===T,_=!1):(s(h.text,["--","++","!","~"])||t)&&(i=!1,_=!1,!h.wanted_newline||"--"!==h.text&&"++"!==h.text||L(!1,!0),";"===R.last_text&&j(R.mode)&&(i=!0),"TK_RESERVED"===T?i=!0:"TK_END_EXPR"===T?i=!("]"===R.last_text&&("--"===h.text||"++"===h.text)):"TK_OPERATOR"===T&&(i=s(h.text,["--","-","++","+"])&&s(R.last_text,["--","-","++","+"]),s(h.text,["+","-"])&&s(R.last_text,["--","++"])&&(_=!0)),(R.mode!==f.BlockStatement||R.inline_frame)&&R.mode!==f.Statement||"{"!==R.last_text&&";"!==R.last_text||L());n.space_before_token=n.space_before_token||i,P(),n.space_before_token=_}else P();else P()},TK_COMMA:function(){A(h,!0),P(),n.space_before_token=!0,R.declaration_statement?(j(R.parent.mode)&&(R.declaration_assignment=!1),R.declaration_assignment?(R.declaration_assignment=!1,L(!1,!0)):k.comma_first&&N()):R.mode===f.ObjectLiteral||R.mode===f.Statement&&R.parent.mode===f.ObjectLiteral?(R.mode===f.Statement&&W(),R.inline_frame||L()):k.comma_first&&N()},TK_BLOCK_COMMENT:function(e){if(n.raw)return n.add_raw_token(h),void(h.directives&&"end"===h.directives.preserve&&(n.raw=k.test_output_raw));if(h.directives)return L(!1,e),P(),"start"===h.directives.preserve&&(n.raw=!0),void L(!1,!0);if(!i.newline.test(h.text)&&!h.wanted_newline)return n.space_before_token=!0,P(),void(n.space_before_token=!0);var t,r=function(e){for(var t=[],n=(e=e.replace(i.allLineBreaks,"\n")).indexOf("\n");-1!==n;)t.push(e.substring(0,n)),e=e.substring(n+1),n=e.indexOf("\n");return e.length&&t.push(e),t}(h.text),_=!1,a=!1,o=h.whitespace_before,s=o.length;for(L(!1,e),r.length>1&&(_=function(e,t){for(var n=0;n<e.length;n++){var r=e[n].replace(/^\s+|\s+${'$'}/g,"");if(r.charAt(0)!==t)return!1}return!0}(r.slice(1),"*"),a=function(e,t){for(var n,r=0,i=e.length;r<i;r++)if((n=e[r])&&0!==n.indexOf(t))return!1;return!0}(r.slice(1),o)),P(r[0]),t=1;t<r.length;t++)L(!1,!0),_?P(" "+r[t].replace(/^\s+/g,"")):a&&r[t].length>s?P(r[t].substring(s)):n.add_token(r[t]);L(!1,e)},TK_COMMENT:function(e){h.wanted_newline?L(!1,e):n.trim(!0),n.space_before_token=!0,P(),L(!1,e)},TK_DOT:function(){z()||A(h,!0),"TK_RESERVED"===T&&F(R.last_text)?n.space_before_token=!0:N(")"===R.last_text&&k.break_chained_methods),P()},TK_UNKNOWN:function(e){P(),"\n"===h.text[h.text.length-1]&&L(!1,e)},TK_EOF:function(){for(;R.mode===f.Statement;)W();A(h)}},t=r(t=t||{},"js"),k={},"expand-strict"===t.brace_style?t.brace_style="expand":"collapse-preserve-inline"===t.brace_style?t.brace_style="collapse,preserve-inline":void 0!==t.braces_on_own_line?t.brace_style=t.braces_on_own_line?"expand":"collapse":t.brace_style||(t.brace_style="collapse");var y=t.brace_style.split(/[^a-zA-Z0-9_\-]+/);k.brace_preserve_inline=!1,k.brace_style="collapse";for(var g=0;g<y.length;g++)"preserve-inline"===y[g]?k.brace_preserve_inline=!0:k.brace_style=y[g];for(k.indent_size=t.indent_size?parseInt(t.indent_size,10):4,k.indent_char=t.indent_char?t.indent_char:" ",k.eol=t.eol?t.eol:"auto",k.preserve_newlines=void 0===t.preserve_newlines||t.preserve_newlines,k.unindent_chained_methods=void 0!==t.unindent_chained_methods&&t.unindent_chained_methods,k.break_chained_methods=void 0!==t.break_chained_methods&&t.break_chained_methods,k.max_preserve_newlines=void 0===t.max_preserve_newlines?0:parseInt(t.max_preserve_newlines,10),k.space_in_paren=void 0!==t.space_in_paren&&t.space_in_paren,k.space_in_empty_paren=void 0!==t.space_in_empty_paren&&t.space_in_empty_paren,k.jslint_happy=void 0!==t.jslint_happy&&t.jslint_happy,k.space_after_anon_function=void 0!==t.space_after_anon_function&&t.space_after_anon_function,k.keep_array_indentation=void 0!==t.keep_array_indentation&&t.keep_array_indentation,k.space_before_conditional=void 0===t.space_before_conditional||t.space_before_conditional,k.unescape_strings=void 0!==t.unescape_strings&&t.unescape_strings,k.wrap_line_length=void 0===t.wrap_line_length?0:parseInt(t.wrap_line_length,10),k.e4x=void 0!==t.e4x&&t.e4x,k.end_with_newline=void 0!==t.end_with_newline&&t.end_with_newline,k.comma_first=void 0!==t.comma_first&&t.comma_first,k.operator_position=function(e){if(!s(e=e||c.before_newline,l))throw new Error("Invalid Option Value: The option 'operator_position' must be one of the following values\n"+l+"\nYou passed in: '"+e+"'");return e}(t.operator_position),k.test_output_raw=void 0!==t.test_output_raw&&t.test_output_raw,k.jslint_happy&&(k.space_after_anon_function=!0),t.indent_with_tabs&&(k.indent_char="\t",k.indent_size=1),"auto"===k.eol&&(k.eol="\n",e&&i.lineBreak.test(e||"")&&(k.eol=e.match(i.lineBreak)[0])),k.eol=k.eol.replace(/\\r/,"\r").replace(/\\n/,"\n"),x="";k.indent_size>0;)x+=k.indent_char,k.indent_size-=1;var D=0;if(e&&e.length){for(;" "===e.charAt(D)||"\t"===e.charAt(D);)D+=1;O=e.substring(0,D),e=e.substring(D)}function A(e,t){for(var n=e.newlines,r=k.keep_array_indentation&&I(R.mode),i=h,_=0;_<e.comments_before.length;_++)A(h=e.comments_before[_],t),v[h.type](t);if(h=i,r)for(var a=0;a<n;a+=1)L(a>0,t);else if(k.max_preserve_newlines&&n>k.max_preserve_newlines&&(n=k.max_preserve_newlines),k.preserve_newlines&&e.newlines>1){L(!1,t);for(var o=1;o<n;o+=1)L(!0,t)}}T="TK_START_BLOCK",E="",(n=new _(x,O)).raw=k.test_output_raw,m=[],M(f.BlockStatement),this.beautify=function(){for(u=new a(e,k,x),w=u.tokenize(),d=0,h=U();h;)v[h.type](),E=R.last_text,T=h.type,R.last_text=h.text,d+=1,h=U();return n.get_code(k.end_with_newline,k.eol)};var C=["break","continue","return","throw","yield"];function N(e){if(e=void 0!==e&&e,!n.just_added_newline()){var t=k.preserve_newlines&&h.wanted_newline||e;if(s(R.last_text,u.positionable_operators)||s(h.text,u.positionable_operators)){var r=s(R.last_text,u.positionable_operators)&&s(k.operator_position,p)||s(h.text,u.positionable_operators);t=t&&r}if(t)L(!1,!0);else if(k.wrap_line_length){if("TK_RESERVED"===T&&s(R.last_text,C))return;n.current_line.get_character_count()+h.text.length+(n.space_before_token?1:0)>=k.wrap_line_length&&L(!1,!0)}}}function L(e,t){if(!t&&";"!==R.last_text&&","!==R.last_text&&"="!==R.last_text&&"TK_OPERATOR"!==T)for(var r=U(1);!(R.mode!==f.Statement||R.if_block&&r&&"TK_RESERVED"===r.type&&"else"===r.text||R.do_block);)W();n.add_new_line(e)&&(R.multiline_frame=!0)}function V(){n.just_added_newline()&&(k.keep_array_indentation&&I(R.mode)&&h.wanted_newline?(n.current_line.push(h.whitespace_before),n.space_before_token=!1):n.set_indent(R.indentation_level)&&(R.line_indent_level=R.indentation_level))}function P(e){if(n.raw)n.add_raw_token(h);else{if(k.comma_first&&"TK_COMMA"===T&&n.just_added_newline()&&","===n.previous_line.last()){var t=n.previous_line.pop();n.previous_line.is_empty()&&(n.previous_line.push(t),n.trim(!0),n.current_line.pop(),n.trim()),V(),n.add_token(","),n.space_before_token=!0}e=e||h.text,V(),n.add_token(e)}}function B(){R.indentation_level+=1}function M(e){R?(m.push(R),K=R):K=S(null,e),R=S(K,e)}function I(e){return e===f.ArrayLiteral}function j(e){return s(e,[f.Expression,f.ForInitializer,f.Conditional])}function W(){m.length>0&&(K=R,R=m.pop(),K.mode!==f.Statement||k.unindent_chained_methods||o(n,K))}function X(){return R.parent.mode===f.ObjectLiteral&&R.mode===f.Statement&&(":"===R.last_text&&0===R.ternary_depth||"TK_RESERVED"===T&&s(R.last_text,["get","set"]))}function z(){return!!("TK_RESERVED"===T&&s(R.last_text,["var","let","const"])&&"TK_WORD"===h.type||"TK_RESERVED"===T&&"do"===R.last_text||"TK_RESERVED"===T&&s(R.last_text,C)&&!h.wanted_newline||"TK_RESERVED"===T&&"else"===R.last_text&&("TK_RESERVED"!==h.type||"if"!==h.text||h.comments_before.length)||"TK_END_EXPR"===T&&(K.mode===f.ForInitializer||K.mode===f.Conditional)||"TK_WORD"===T&&R.mode===f.BlockStatement&&!R.in_case&&"--"!==h.text&&"++"!==h.text&&"function"!==E&&"TK_WORD"!==h.type&&"TK_RESERVED"!==h.type||R.mode===f.ObjectLiteral&&(":"===R.last_text&&0===R.ternary_depth||"TK_RESERVED"===T&&s(R.last_text,["get","set"])))&&(M(f.Statement),k.unindent_chained_methods||B(),A(h,!0),X()||N("TK_RESERVED"===h.type&&s(h.text,["do","for","if","while"])),!0)}function F(e){return s(e,["case","return","do","if","throw","else"])}function U(e){var t=d+(e||0);return t<0||t>=w.length?null:w[t]}function Q(){if("TK_RESERVED"===h.type&&(s(h.text,["set","get"])&&R.mode!==f.ObjectLiteral?h.type="TK_WORD":s(h.text,["as","from"])&&!R.import_block?h.type="TK_WORD":R.mode===f.ObjectLiteral&&":"===U(1).text&&(h.type="TK_WORD")),z()?"TK_RESERVED"===T&&s(R.last_text,["var","let","const"])&&"TK_WORD"===h.type&&(R.declaration_statement=!0):!h.wanted_newline||j(R.mode)||"TK_OPERATOR"===T&&"--"!==R.last_text&&"++"!==R.last_text||"TK_EQUALS"===T||!k.preserve_newlines&&"TK_RESERVED"===T&&s(R.last_text,["var","let","const","set","get"])?A(h):(A(h),L()),R.do_block&&!R.do_while){if("TK_RESERVED"===h.type&&"while"===h.text)return n.space_before_token=!0,P(),n.space_before_token=!0,void(R.do_while=!0);L(),R.do_block=!1}if(R.if_block)if(R.else_block||"TK_RESERVED"!==h.type||"else"!==h.text){for(;R.mode===f.Statement;)W();R.if_block=!1,R.else_block=!1}else R.else_block=!0;return"TK_RESERVED"===h.type&&("case"===h.text||"default"===h.text&&R.in_case_statement)?(L(),(R.case_body||k.jslint_happy)&&(R.indentation_level>0&&(!R.parent||R.indentation_level>R.parent.indentation_level)&&(R.indentation_level-=1),R.case_body=!1),P(),R.in_case=!0,void(R.in_case_statement=!0)):("TK_COMMA"!==T&&"TK_START_EXPR"!==T&&"TK_EQUALS"!==T&&"TK_OPERATOR"!==T||X()||N(),"TK_RESERVED"===h.type&&"function"===h.text?((s(R.last_text,["}",";"])||n.just_added_newline()&&!s(R.last_text,["(","[","{",":","=",","])&&"TK_OPERATOR"!==T)&&(n.just_added_blankline()||h.comments_before.length||(L(),L(!0))),"TK_RESERVED"===T||"TK_WORD"===T?"TK_RESERVED"===T&&(s(R.last_text,["get","set","new","export","async"])||s(R.last_text,C))?n.space_before_token=!0:"TK_RESERVED"===T&&"default"===R.last_text&&"export"===E?n.space_before_token=!0:L():"TK_OPERATOR"===T||"="===R.last_text?n.space_before_token=!0:(R.multiline_frame||!j(R.mode)&&!I(R.mode))&&L(),P(),void(R.last_word=h.text)):(b="NONE","TK_END_BLOCK"===T?K.inline_frame?b="SPACE":"TK_RESERVED"===h.type&&s(h.text,["else","catch","finally","from"])?"expand"===k.brace_style||"end-expand"===k.brace_style||"none"===k.brace_style&&h.wanted_newline?b="NEWLINE":(b="SPACE",n.space_before_token=!0):b="NEWLINE":"TK_SEMICOLON"===T&&R.mode===f.BlockStatement?b="NEWLINE":"TK_SEMICOLON"===T&&j(R.mode)?b="SPACE":"TK_STRING"===T?b="NEWLINE":"TK_RESERVED"===T||"TK_WORD"===T||"*"===R.last_text&&(s(E,["function","yield"])||R.mode===f.ObjectLiteral&&s(E,["{",","]))?b="SPACE":"TK_START_BLOCK"===T?b=R.inline_frame?"SPACE":"NEWLINE":"TK_END_EXPR"===T&&(n.space_before_token=!0,b="NEWLINE"),"TK_RESERVED"===h.type&&s(h.text,u.line_starters)&&")"!==R.last_text&&(b=R.inline_frame||"else"===R.last_text||"export"===R.last_text?"SPACE":"NEWLINE"),"TK_RESERVED"===h.type&&s(h.text,["else","catch","finally"])?("TK_END_BLOCK"!==T||K.mode!==f.BlockStatement||"expand"===k.brace_style||"end-expand"===k.brace_style||"none"===k.brace_style&&h.wanted_newline)&&!R.inline_frame?L():(n.trim(!0),"}"!==n.current_line.last()&&L(),n.space_before_token=!0):"NEWLINE"===b?"TK_RESERVED"===T&&F(R.last_text)?n.space_before_token=!0:"TK_END_EXPR"!==T?"TK_START_EXPR"===T&&"TK_RESERVED"===h.type&&s(h.text,["var","let","const"])||":"===R.last_text||("TK_RESERVED"===h.type&&"if"===h.text&&"else"===R.last_text?n.space_before_token=!0:L()):"TK_RESERVED"===h.type&&s(h.text,u.line_starters)&&")"!==R.last_text&&L():R.multiline_frame&&I(R.mode)&&","===R.last_text&&"}"===E?L():"SPACE"===b&&(n.space_before_token=!0),P(),R.last_word=h.text,void("TK_RESERVED"===h.type&&("do"===h.text?R.do_block=!0:"if"===h.text?R.if_block=!0:"import"===h.text?R.import_block=!0:R.import_block&&"TK_RESERVED"===h.type&&"from"===h.text&&(R.import_block=!1)))))}}},function(e,t){e.exports.InputScanner=function(e){var t=e,n=t.length,r=0;this.back=function(){r-=1},this.hasNext=function(){return r<n},this.next=function(){var e=null;return this.hasNext()&&(e=t.charAt(r),r+=1),e},this.peek=function(e){var i=null;return e=e||0,(e+=r)>=0&&e<n&&(i=t.charAt(e)),i},this.peekCharCode=function(e){var i=0;return e=e||0,(e+=r)>=0&&e<n&&(i=t.charCodeAt(e)),i},this.test=function(e,n){return n=n||0,e.lastIndex=r+n,e.test(t)},this.testChar=function(e,t){var n=this.peek(t);return null!==n&&e.test(n)},this.match=function(e){e.lastIndex=r;var n=e.exec(t);return n&&n.index===r?r+=n[0].length:n=null,n}}},function(e,t){e.exports.mergeOpts=function(e,t){var n,r={};for(n in e)n!==t&&(r[n]=e[n]);if(t in e)for(n in e[t])r[n]=e[t][n];return r}},function(e,t){e.exports.Output=function(e,t){t=t||"",this.indent_cache=[t],this.baseIndentLength=t.length,this.indent_length=e.length,this.raw=!1;var n=[];this.baseIndentString=t,this.indent_string=e,this.previous_line=null,this.current_line=null,this.space_before_token=!1,this.add_outputline=function(){this.previous_line=this.current_line,this.current_line=new function(e){var t=0,n=-1,r=[],i=!0;this.set_indent=function(r){t=e.baseIndentLength+r*e.indent_length,n=r},this.get_character_count=function(){return t},this.is_empty=function(){return i},this.last=function(){return this._empty?null:r[r.length-1]},this.push=function(e){r.push(e),t+=e.length,i=!1},this.pop=function(){var e=null;return i||(e=r.pop(),t-=e.length,i=0===r.length),e},this.remove_indent=function(){n>0&&(n-=1,t-=e.indent_length)},this.trim=function(){for(;" "===this.last();)r.pop(),t-=1;i=0===r.length},this.toString=function(){var t="";return this._empty||(n>=0&&(t=e.indent_cache[n]),t+=r.join("")),t}}(this),n.push(this.current_line)},this.add_outputline(),this.get_line_number=function(){return n.length},this.add_new_line=function(e){return!(1===this.get_line_number()&&this.just_added_newline()||!e&&this.just_added_newline()||(this.raw||this.add_outputline(),0))},this.get_code=function(e,t){var r=n.join("\n").replace(/[\r\n\t ]+${'$'}/,"");return e&&(r+="\n"),"\n"!==t&&(r=r.replace(/[\n]/g,t)),r},this.set_indent=function(e){if(n.length>1){for(;e>=this.indent_cache.length;)this.indent_cache.push(this.indent_cache[this.indent_cache.length-1]+this.indent_string);return this.current_line.set_indent(e),!0}return this.current_line.set_indent(0),!1},this.add_raw_token=function(e){for(var t=0;t<e.newlines;t++)this.add_outputline();this.current_line.push(e.whitespace_before),this.current_line.push(e.text),this.space_before_token=!1},this.add_token=function(e){this.add_space_before_token(),this.current_line.push(e)},this.add_space_before_token=function(){this.space_before_token&&!this.just_added_newline()&&this.current_line.push(" "),this.space_before_token=!1},this.remove_indent=function(e){for(var t=n.length;e<t;)n[e].remove_indent(),e++},this.trim=function(r){for(r=void 0!==r&&r,this.current_line.trim(e,t);r&&n.length>1&&this.current_line.is_empty();)n.pop(),this.current_line=n[n.length-1],this.current_line.trim();this.previous_line=n.length>1?n[n.length-2]:null},this.just_added_newline=function(){return this.current_line.is_empty()},this.just_added_blankline=function(){return!!this.just_added_newline()&&(1===n.length||n[n.length-2].is_empty())}}},function(e,t){e.exports.Token=function(e,t,n,r,i){this.type=e,this.text=t,this.comments_before=[],this.comments_after=[],this.newlines=n||0,this.wanted_newline=n>0,this.whitespace_before=r||"",this.parent=i||null,this.opened=null,this.directives=null}},function(e,t,n){var r=n(1).Beautifier;e.exports=function(e,t){return new r(e,t).beautify()}},function(e,t,n){var r=n(2).InputScanner,i=n(5).Token,_=n(0);function a(e,t){for(var n=0;n<t.length;n+=1)if(t[n]===e)return!0;return!1}e.exports.Tokenizer=function(e,t){var n="\n\r\t ".split(""),o=/[0-9]/,s=/[01]/,l=/[01234567]/,c=/[0123456789abcdefABCDEF]/;this.positionable_operators="!= !== % & && * ** + - / : < << <= == === > >= >> >>> ? ^ | ||".split(" ");var p=this.positionable_operators.concat("! %= &= *= **= ++ += , -- -= /= :: <<= = => >>= >>>= ^= |= ~ ...".split(" "));this.line_starters="continue,try,throw,return,var,let,const,if,switch,case,default,for,while,break,function,import,export".split(",");var f,d,u,h,T,E=this.line_starters.concat(["do","in","of","else","get","set","new","catch","finally","typeof","yield","async","await","from","as"]),x=/([\s\S]*?)((?:\*\/)|${'$'})/g,R=/([^\n\r\u2028\u2029]*)/g,K=/\/\* beautify( \w+[:]\w+)+ \*\//g,m=/ (\w+)[:](\w+)/g,b=/([\s\S]*?)((?:\/\*\sbeautify\signore:end\s\*\/)|${'$'})/g,v=/((<\?php|<\?=)[\s\S]*?\?>)|(<%[\s\S]*?%>)/g;function k(){var e,k=[];f=0,d="";var w,O=T.next();if(null===O)return["","TK_EOF"];for(w=h.length?h[h.length-1]:new i("TK_START_BLOCK","{");a(O,n);)if(_.newline.test(O)?"\n"===O&&"\r"===T.peek(-2)||(f+=1,k=[]):k.push(O),null===(O=T.next()))return["","TK_EOF"];if(k.length&&(d=k.join("")),o.test(O)||"."===O&&T.testChar(o)){var S=!0,y=!0,g=o;for("0"===O&&T.testChar(/[XxOoBb]/)?(S=!1,y=!1,g=T.testChar(/[Bb]/)?s:T.testChar(/[Oo]/)?l:c,O+=T.next()):"."===O?S=!1:(O="",T.back());T.testChar(g);)O+=T.next(),S&&"."===T.peek()&&(O+=T.next(),S=!1),y&&T.testChar(/[Ee]/)&&(O+=T.next(),T.testChar(/[+-]/)&&(O+=T.next()),y=!1,S=!1);return[O,"TK_WORD"]}if(_.isIdentifierStart(T.peekCharCode(-1))){if(T.hasNext())for(;_.isIdentifierChar(T.peekCharCode())&&(O+=T.next(),T.hasNext()););return"TK_DOT"===w.type||"TK_RESERVED"===w.type&&a(w.text,["set","get"])||!a(O,E)?[O,"TK_WORD"]:"in"===O||"of"===O?[O,"TK_OPERATOR"]:[O,"TK_RESERVED"]}if("("===O||"["===O)return[O,"TK_START_EXPR"];if(")"===O||"]"===O)return[O,"TK_END_EXPR"];if("{"===O)return[O,"TK_START_BLOCK"];if("}"===O)return[O,"TK_END_BLOCK"];if(";"===O)return[O,"TK_SEMICOLON"];if("/"===O){var D="";if("*"===T.peek()){T.next();var A=function(e){if(!e.match(K))return null;var t={};m.lastIndex=0;for(var n=m.exec(e);n;)t[n[1]]=n[2],n=m.exec(e);return t}(D="/*"+T.match(x)[0]);return A&&"start"===A.ignore&&(D+=T.match(b)[0]),[D=D.replace(_.allLineBreaks,"\n"),"TK_BLOCK_COMMENT",A]}if("/"===T.peek())return T.next(),[D="//"+T.match(R)[0],"TK_COMMENT"]}var C,N=/<()([-a-zA-Z:0-9_.]+|{[\s\S]+?}|!\[CDATA\[[\s\S]*?\]\])(\s+{[\s\S]+?}|\s+[-a-zA-Z:0-9_.]+|\s+[-a-zA-Z:0-9_.]+\s*=\s*('[^']*'|"[^"]*"|{[\s\S]+?}))*\s*(\/?)\s*>/g;if("`"===O||"'"===O||'"'===O||("/"===O||t.e4x&&"<"===O&&T.test(N,-1))&&("TK_RESERVED"===w.type&&a(w.text,["return","case","throw","else","do","typeof","yield"])||"TK_END_EXPR"===w.type&&")"===w.text&&w.parent&&"TK_RESERVED"===w.parent.type&&a(w.parent.text,["if","while","for"])||a(w.type,["TK_COMMENT","TK_START_EXPR","TK_START_BLOCK","TK_END_BLOCK","TK_OPERATOR","TK_EQUALS","TK_EOF","TK_SEMICOLON","TK_COMMA"]))){var L=O,V=!1,P=!1;if(e=O,"/"===L)for(var B=!1;T.hasNext()&&(V||B||T.peek()!==L)&&!T.testChar(_.newline);)e+=T.peek(),V?V=!1:(V="\\"===T.peek(),"["===T.peek()?B=!0:"]"===T.peek()&&(B=!1)),T.next();else if(t.e4x&&"<"===L){var M=/[\s\S]*?<(\/?)([-a-zA-Z:0-9_.]+|{[\s\S]+?}|!\[CDATA\[[\s\S]*?\]\])(\s+{[\s\S]+?}|\s+[-a-zA-Z:0-9_.]+|\s+[-a-zA-Z:0-9_.]+\s*=\s*('[^']*'|"[^"]*"|{[\s\S]+?}))*\s*(\/?)\s*>/g;T.back();var I="",j=T.match(N);if(j){for(var W=j[2].replace(/^{\s+/,"{").replace(/\s+}${'$'}/,"}"),X=0===W.indexOf("{"),z=0;j;){var F=!!j[1],U=j[2];if(!(j[j.length-1]||"![CDATA["===U.slice(0,8))&&(U===W||X&&U.replace(/^{\s+/,"{").replace(/\s+}${'$'}/,"}"))&&(F?--z:++z),I+=j[0],z<=0)break;j=T.match(M)}return j||(I+=T.match(/[\s\S]*/g)[0]),[I=I.replace(_.allLineBreaks,"\n"),"TK_STRING"]}}else{var Q=function(t,n,r){for(var i;T.hasNext()&&(i=T.peek(),V||i!==t&&(n||!_.newline.test(i)));)(V||n)&&_.newline.test(i)?("\r"===i&&"\n"===T.peek(1)&&(T.next(),i=T.peek()),e+="\n"):e+=i,V?("x"!==i&&"u"!==i||(P=!0),V=!1):V="\\"===i,T.next(),r&&-1!==e.indexOf(r,e.length-r.length)&&("`"===t?Q("}",n,"`"):Q("`",n,"${'$'}{"),T.hasNext()&&(e+=T.next()))};"`"===L?Q("`",!0,"${'$'}{"):Q(L)}if(P&&t.unescape_strings&&(e=function(e){for(var t="",n=0,i=new r(e),_=null;i.hasNext();)if((_=i.match(/([\s]|[^\\]|\\\\)+/g))&&(t+=_[0]),"\\"===i.peek()){if(i.next(),"x"===i.peek())_=i.match(/x([0-9A-Fa-f]{2})/g);else{if("u"!==i.peek()){t+="\\",i.hasNext()&&(t+=i.next());continue}_=i.match(/u([0-9A-Fa-f]{4})/g)}if(!_)return e;if((n=parseInt(_[1],16))>126&&n<=255&&0===_[0].indexOf("x"))return e;if(n>=0&&n<32){t+="\\"+_[0];continue}t+=34===n||39===n||92===n?"\\"+String.fromCharCode(n):String.fromCharCode(n)}return t}(e)),T.peek()===L&&(e+=L,T.next(),"/"===L))for(;T.hasNext()&&_.isIdentifierStart(T.peekCharCode());)e+=T.next();return[e,"TK_STRING"]}if("#"===O){if(0===h.length&&"!"===T.peek()){for(e=O;T.hasNext()&&"\n"!==O;)O=T.next(),e+=O;return[(C=e,C.replace(/^\s+|\s+${'$'}/g,"")+"\n"),"TK_UNKNOWN"]}var ${'$'}="#";if(T.hasNext()&&T.testChar(o)){do{${'$'}+=O=T.next()}while(T.hasNext()&&"#"!==O&&"="!==O);return"#"===O||("["===T.peek()&&"]"===T.peek(1)?(${'$'}+="[]",T.next(),T.next()):"{"===T.peek()&&"}"===T.peek(1)&&(${'$'}+="{}",T.next(),T.next())),[${'$'},"TK_WORD"]}}if("<"===O&&("?"===T.peek()||"%"===T.peek())){T.back();var Z=T.match(v);if(Z)return[O=(O=Z[0]).replace(_.allLineBreaks,"\n"),"TK_STRING"]}if("<"===O&&T.match(/\!--/g)){for(O="\x3c!--";T.hasNext()&&!T.testChar(_.newline);)O+=T.next();return u=!0,[O,"TK_COMMENT"]}if("-"===O&&u&&T.match(/->/g))return u=!1,["--\x3e","TK_COMMENT"];if("."===O)return"."===T.peek()&&"."===T.peek(1)?[O+=T.next()+T.next(),"TK_OPERATOR"]:[O,"TK_DOT"];if(a(O,p)){for(;T.hasNext()&&a(O+T.peek(),p)&&(O+=T.next(),T.hasNext()););return","===O?[O,"TK_COMMA"]:"="===O?[O,"TK_EQUALS"]:[O,"TK_OPERATOR"]}return[O,"TK_UNKNOWN"]}this.tokenize=function(){var t,n,_;T=new r(e),u=!1,h=[];for(var a=null,o=[],s=[];!n||"TK_EOF"!==n.type;){for(_=k(),t=new i(_[1],_[0],f,d);"TK_COMMENT"===t.type||"TK_BLOCK_COMMENT"===t.type||"TK_UNKNOWN"===t.type;)"TK_BLOCK_COMMENT"===t.type&&(t.directives=_[2]),s.push(t),_=k(),t=new i(_[1],_[0],f,d);s.length&&(t.comments_before=s,s=[]),"TK_START_BLOCK"===t.type||"TK_START_EXPR"===t.type?(t.parent=n,o.push(a),a=t):("TK_END_BLOCK"===t.type||"TK_END_EXPR"===t.type)&&a&&("]"===t.text&&"["===a.text||")"===t.text&&"("===a.text||"}"===t.text&&"{"===a.text)&&(t.parent=a.parent,t.opened=a,a=o.pop()),h.push(t),n=t}return h}}}]);"function"==typeof define&&define.amd?define([],function(){return{js_beautify:e}}):"undefined"!=typeof exports?exports.js_beautify=e:"undefined"!=typeof window?window.js_beautify=e:"undefined"!=typeof global&&(global.js_beautify=e)}();
"""