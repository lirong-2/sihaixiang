// pages/like/like.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    num: 0,
    openId: ""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    
    //向服务端发送参数并接受json，心愿单列表
    wx.login({
      success(res) {
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'http://localhost:8080/shx/shx/wish',
            data: {
              openId:"o89RK5PQcfEqjhj9y2mwYvtmHr9c"
            },
            success(result) {
              console.log("result-wish")
              console.log(result)
              that.setData({
                list: result.data,
                num: result.data.length
              })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    })
  },

  /**
   * 清空
   */
  del: function(){
    console.log("===清空===")
    var that = this;
    that.setData({
      num: 0,
      list: [],
      delState: 1
    })
  },

  /**
   * 取消
   */
  cancel: function () {
    console.log("===取消===")
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})