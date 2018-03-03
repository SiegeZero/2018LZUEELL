var pieData = [
            {
                value: 300,
                color: radom_color(),
                highlight:  radom_color(),
                label: "Red"

            },
            {
                value: 200,
                color:  radom_color(),
                highlight:  radom_color(),
                label: "Green"
            },
            {
                value: 100,
                color:  radom_color(),
                highlight:  radom_color(),
                label: "Yellow"
            },
            {
                value: 400,
                color:  radom_color(),
                highlight:  radom_color(),
                label: "Grey"
            },
            {
                value: 120,
                color:  radom_color(),
                highlight:  radom_color(),
                label: "Dark Grey"
            }
        ];
            var ctx = document.getElementById("chart-pie").getContext("2d");
            window.myPie = new Chart(ctx).Pie(pieData);