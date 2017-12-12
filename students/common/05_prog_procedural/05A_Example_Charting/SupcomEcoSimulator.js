var labels = [];
for (var i = 0; i < 10; i++) labels.push(i.toString());

var ctx = document.getElementById("myChart");

var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: labels,
        datasets: [{
            label: "Power",
            backgroundColor: "Gold",
            borderColor: "Gold",
            data: [
                1000,
                2,
                5,
                8,
                2
            ],
            fill: false,
        }, {
            label: "Mass",
            fill: false,
            backgroundColor: "DimGrey",
            borderColor: "DimGrey",
            data: [
                200,
                2,
                4,
                1,
                4
            ],
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        },
        responsive: true
    }
});

function addData(chart, label, data) {
    chart.data.labels.push(label);
    chart.data.datasets.forEach((dataset) => {
        dataset.data.push(data);
    });
    chart.update();
}