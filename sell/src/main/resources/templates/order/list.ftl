<html>
   <head>
       <meta charset="utf-8">
       <title>卖家商品列表</title>
       <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
   </head>
   <body>
   <div class="container">
       <div class="row clearfix">
           <div class="col-md-12 column">
               <table class="table table-bordered">
                   <thead>
                   <tr>
                       <th>订单id</th>
                       <th>姓名</th>
                       <th>手机号</th>
                       <th>地址</th>
                       <th>金额</th>
                       <th>订单状态 </th>
                       <th>支付状态</th>
                       <th>创建时间</th>
                       <th colspan="2">操作</th>
                   </tr>
                   </thead>
                   <tbody>
                   <#--<#if orderDTOList?exists&&orderDTOList.size()!=0>-->
                   <#list orderDTOList555 as orderDTO>
                   <tr>
                       <td>${orderDTO.orderId}</td>
                       <td>${orderDTO.buyerName}</td>
                       <td>${orderDTO.buyerPhone}</td>
                       <td>${orderDTO.buyerAddress}</td>
                       <td>${orderDTO.orderAmount}</td>
                       <td>${orderDTO.getOrderStatusEnum().getMessage()}</td>
                       <td>${orderDTO.getPayStatusEnum().getMessage()}</td>
                       <td>创建时间，无法正常显示</td>
                       <td><a href="/sell/seller/order/detail?orderId=${orderDTO.orderId}">详情</a></td>
                       <td><#if orderDTO.orderStatus == 0>
                           <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}">取消</a>
                       </#if></td>
                   </tr>
                   </#list>
                   <#--</#if>-->
                   </tbody>
               </table>
           </div>
       </div>
   </div>

   </body>
</html>



