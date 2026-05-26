select id,
MAX(if(month='Jan',revenue,NULL)) as JAN_Revenue,
MAX(if(month='FEb',revenue,NULL)) as FEB_Revenue,
MAX(if(month='Mar',revenue,NULL)) as MAR_Revenue,
MAX(if(month='Apr',revenue,NULL)) as Apr_Revenue,
MAX(if(month='May',revenue,NULL)) as May_Revenue,
MAX(if(month='Jun',revenue,NULL)) as Jun_Revenue,
MAX(if(month='Jul',revenue,NULL)) as Jul_Revenue,
MAX(if(month='Aug',revenue,NULL)) as Aug_Revenue,
MAX(if(month='Sep',revenue,NULL)) as Sep_Revenue,
MAX(if(month='Oct',revenue,NULL)) as Oct_Revenue,
MAX(if(month='Nov',revenue,NULL)) as Nov_Revenue,
MAX(if(month='Dec',revenue,NULL)) as Dec_Revenue

FROM Department
group by id
order by id;