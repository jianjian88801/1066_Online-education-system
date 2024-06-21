
var projectName = '微服务在线教育系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课程信息',
	url: './pages/kechengxinxi/list.html'
}, 
{
	name: '职业规划',
	url: './pages/zhiyeguihua/list.html'
}, 
{
	name: '视频点播',
	url: './pages/shipindianbo/list.html'
}, 

{
	name: '学习交流',
	url: './pages/forum/list.html'
}, 
{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
{
	name: '教育资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springbootus5uu/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","购买"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程类型","menuJump":"列表","tableName":"kechengleixing"}],"menu":"课程类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学科","menuJump":"列表","tableName":"xueke"}],"menu":"学科管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","支付"],"menu":"购买的课程","menuJump":"列表","tableName":"goumaidekecheng"}],"menu":"购买的课程管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"职业规划","menuJump":"列表","tableName":"zhiyeguihua"}],"menu":"职业规划管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"视频点播","menuJump":"列表","tableName":"shipindianbo"}],"menu":"视频点播管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的课程","menuJump":"列表","tableName":"wodekecheng"}],"menu":"我的课程管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"消息通知","menuJump":"列表","tableName":"xiaoxitongzhi"}],"menu":"消息通知管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学习交流","tableName":"forum"}],"menu":"学习交流"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客户服务","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"教育资讯","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","购买"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看"],"menu":"职业规划列表","menuJump":"列表","tableName":"zhiyeguihua"}],"menu":"职业规划模块"},{"child":[{"buttons":["查看"],"menu":"视频点播列表","menuJump":"列表","tableName":"shipindianbo"}],"menu":"视频点播模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"购买的课程","menuJump":"列表","tableName":"goumaidekecheng"}],"menu":"购买的课程管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的笔记","menuJump":"列表","tableName":"wodebiji"}],"menu":"我的笔记管理"},{"child":[{"buttons":["查看"],"menu":"我的课程","menuJump":"列表","tableName":"wodekecheng"}],"menu":"我的课程管理"},{"child":[{"buttons":["查看","新增"],"menu":"消息通知","menuJump":"列表","tableName":"xiaoxitongzhi"}],"menu":"消息通知管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","购买"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看"],"menu":"职业规划列表","menuJump":"列表","tableName":"zhiyeguihua"}],"menu":"职业规划模块"},{"child":[{"buttons":["查看"],"menu":"视频点播列表","menuJump":"列表","tableName":"shipindianbo"}],"menu":"视频点播模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
