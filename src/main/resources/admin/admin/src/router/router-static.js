import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import news from '@/views/modules/news/list'
    import xiaoxitongzhi from '@/views/modules/xiaoxitongzhi/list'
    import examquestion from '@/views/modules/examquestion/list'
    import shipindianbo from '@/views/modules/shipindianbo/list'
    import exampaper from '@/views/modules/exampaper/list'
    import discusskechengxinxi from '@/views/modules/discusskechengxinxi/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import zhiyeguihua from '@/views/modules/zhiyeguihua/list'
    import kechengleixing from '@/views/modules/kechengleixing/list'
    import forum from '@/views/modules/forum/list'
    import xueke from '@/views/modules/xueke/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import wodekecheng from '@/views/modules/wodekecheng/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'
    import goumaidekecheng from '@/views/modules/goumaidekecheng/list'
    import wodebiji from '@/views/modules/wodebiji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '教育资讯',
        component: news
      }
      ,{
	path: '/xiaoxitongzhi',
        name: '消息通知',
        component: xiaoxitongzhi
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/shipindianbo',
        name: '视频点播',
        component: shipindianbo
      }
      ,{
	path: '/exampaper',
        name: '试卷管理',
        component: exampaper
      }
      ,{
	path: '/discusskechengxinxi',
        name: '课程信息评论',
        component: discusskechengxinxi
      }
      ,{
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/zhiyeguihua',
        name: '职业规划',
        component: zhiyeguihua
      }
      ,{
	path: '/kechengleixing',
        name: '课程类型',
        component: kechengleixing
      }
      ,{
	path: '/forum',
        name: '学习交流',
        component: forum
      }
      ,{
	path: '/xueke',
        name: '学科',
        component: xueke
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '客户服务',
        component: chat
      }
      ,{
	path: '/wodekecheng',
        name: '我的课程',
        component: wodekecheng
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
      ,{
	path: '/goumaidekecheng',
        name: '购买的课程',
        component: goumaidekecheng
      }
      ,{
	path: '/wodebiji',
        name: '我的笔记',
        component: wodebiji
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
