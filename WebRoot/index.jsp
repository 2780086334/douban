<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
   
  </head>
  <style type="text/css">
.search-box{
  border:1px 
  solid #333;
  background:#CCFF99;
}
div{float:left;}
.search-btn{
  display:inline-block;
  width:20px;
  height:20px;
  background:url(http://pic.58pic.com/58pic/14/64/72/27K58PICFYV_1024.jpg);
  background-size: 100%;
}
#aa{
  border:none;
}
  </style>
  <script type="text/javascript" src="js/vue.js"></script>
  <script type="text/javascript" src="js/vue.js"></script>
  <body>
     <div id="dox" style="border:1px solid #C0C0C0;">
     	   <texts></texts>
          <texts2></texts2>
     	 
     </div>

 <template id="tt">
  <div>
 <div class="search-box">
    <div>
        <span class="search-btn" @click="fen01()"></span>
    </div>
    <div>
        <input type="text" placeholder="请输入搜索信息" size="28" class="search-txt" id="aa" height="100px" />
    </div>
</div>
     <ul>
       <li v-for="item in arr">
         <span>{{item.name}}</span> <span>{{item.price}}</span> 
       </li>
     </ul>
</div>
 </template>


  <template id="tt2">

  <div style="border:1px solid #C0C0C0;margin-top:300px;margin-left:-230px">
    <p><img src="image/1.png" width="50px"><img src="image/2.png" width="50px"><img src="image/3.png" width="50px"><img src="image/4.png" width="50px"></p>
    <p><span style="padding:10px;color:#C0C0C0">首页</span><span style="padding:10px;color:#C0C0C0">搜素</span><span style="padding:10px;color:#C0C0C0">热点</span><span style="padding:10px;color:#C0C0C0">购物车</span></p>
  </div>
 </template>

     <script type="text/javascript">
     	var v=new Vue({
            el:"#dox",
            data:{
           
            },
            components:{
         
            	"texts":{
                  template:"#tt",
                  props:['arr'],

                    methods:{
                       fen01(){ 
                         this.arr=[{name:"zz",price:200},{name:"zzZ",price:2000}];
                         // axios.get('/vue-jiekoudiaoyong/servlet/Servlers').then(
                         //       value=>{

                         //            this.arr=value.data;

                         //           }

                         //        );                

                          }
                    }

            	},//texts

              "texts2":{
                  template:"#tt2"




              }//texts2


            }//component

     	});
     </script>
  </body>
</html>
