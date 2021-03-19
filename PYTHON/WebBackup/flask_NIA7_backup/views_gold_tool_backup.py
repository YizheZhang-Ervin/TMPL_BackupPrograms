# finproduct.html
@blue.route('/finproduct/', methods=['GET', 'POST'])
def finproduct():
    if request.method == 'POST':
        date001 = request.form.get('date001', '')
        name001 = request.form.get('name001', '')
        data001 = request.form.getlist('data001')
        try:
            diychart = plot_diy(date001, name001, *data001)
            return render_template('finproduct.html', time='', type='', name='', diychart=diychart)
        except Exception:
            return render_template('finproduct.html', time='', type='', name='', diychart='')
    if request.method == 'GET':
        currenttime = getorigintime()
        recordtime = datetime.datetime.strptime('2019-12-16', "%Y-%m-%d")
        name = ''
        try:
            action = request.args.get('time', '')
            action2 = request.args.get('type', '')
        except Exception:
            action, action2 = '', ''

        if action == 'days' or action == 'tables':
            # 1 week table
            aweek_table = (currenttime - datetime.timedelta(days=6)).strftime('%Y-%m-%d')
            time, name = plot_price_table(aweek_table, gettime())
        elif action == '1week':
            # 1 week
            aweek = (currenttime - datetime.timedelta(days=7)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(aweek, '1week')
        elif action == '2weeks':
            # 2 weeks
            twoweeks = (currenttime - datetime.timedelta(days=14)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(twoweeks, '2weeks')
        elif action == '3weeks':
            # 3 weeks
            threeweeks = (currenttime - datetime.timedelta(days=21)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(threeweeks, '3weeks')
        elif action == '1month':
            # 1 month
            onemonth = (currenttime - datetime.timedelta(days=30)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(onemonth, '1month')
        elif action == '2months':
            # 2 months
            twomonths = (currenttime - datetime.timedelta(days=60)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(twomonths, '2months')
        elif action == '3months':
            # 3 months
            threemonths = (currenttime - datetime.timedelta(days=90)).strftime('%Y-%m-%d')
            time, name = plot_price_trend(threemonths, '3months')
        elif action == '':
            time = ''

        if action2 == '1line-animation':
            typepic, name = plot_animation('All time animation')
        elif action2 == '3d':
            time, name = plot_3D('All time 3D')
            typepic = ''
        else:
            typepic = ''

        # Transfer parameters
        return render_template('finproduct.html', time=time, typepic=typepic, name=name, diychart='')


# tools.html
@blue.route('/tools/', methods=['GET', 'POST'])
def tools():
    if request.method == 'GET':
        return render_template('tools.html')


