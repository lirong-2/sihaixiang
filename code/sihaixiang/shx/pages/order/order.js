// pages/order/order.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    num: 0,
    cookarr: [{
      date: "05-09 11:40",
      week: "周三",
      img: "/img/25.png",
      name: "盛夏海鲜家宴",
      price: "4999"
    },{
      date: "06-07 11:50",
      week: "周四",
      img: "/img/12.png",
      name: "辣条",
      price: "150000"
    },{
      date: "03-10 10:32",
      week: "周二",
      img: "/img/31.png",
      name: "泡泡糖",
      price: "2"
    }]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    that.setData({
      num: that.data.cookarr.length
    })
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