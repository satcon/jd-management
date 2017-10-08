var myChart = null; // 定义全局变量
$(function(){
    myChart = new Highcharts.Chart('container', {
        chart: {
            type: 'line',
            animation: Highcharts.svg, // don't animate in old IE
            marginRight: 10,
            events: {
                load: requestData
                   /*function () {
                    // set up the updating of the chart each second
                    var series = this.series[0];
                    setInterval(function () {
                        var x = (new Date()).getTime(), // current time
                            y = 1;
                        series.addPoint([x, y], true, true);
                    }, 1000);
                }*/
            }
        },
        title: {
            text: 'JVM信息'
        },
        xAxis: {
            type: 'datetime',
            tickPixelInterval: 100,
        },
        yAxis: {
            title: {
                text: 'MB'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            formatter: function () {
                return '<b>' + this.series.name + '</b><br/>' +
                    Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
                    Highcharts.numberFormat(this.y, 2);
            }
        },
        legend: {
            enabled: false
        },
        exporting: {
            enabled: false
        },
        series: [{
            name: '内存',
            data: (function () {
                // generate an array of random data
                var data = [],
                    time = (new Date()).getTime(),
                    i;

                for (i = -19; i <= 0; i += 1) {
                    data.push({
                        x: time + i * 1000,
                        y: 0
                    });
                }
                return data;
            }())
        }]
    });
});

/**
 * Ajax 请求数据接口，并通过 Highcharts 提供的函数进行动态更新
 * 接口调用完毕后间隔 1 s 继续调用本函数，以达到实时请求数据，实时更新的效果
 */
function requestData() {
    $.ajax({
        url: sys.basePath() + '/getJVM',
        success: function(data) {
            var x = (new Date()).getTime(), // current time
                y = Number(data);

            console.info(typeof y);

            // 新增点操作
            //具体的参数详见：https://api.hcharts.cn/highcharts#Series.addPoint
            myChart.series[0].addPoint([x, y], true, true);

            // 一秒后继续调用本函数
            setTimeout(requestData, 1000);
        },
        cache: false
    });
}