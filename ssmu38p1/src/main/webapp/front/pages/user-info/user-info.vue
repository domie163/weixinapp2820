<template>
	<view class="content">
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>用户名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yonghuming" placeholder="用户名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
			<view v-if="tableName=='huanzhe'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">性别</view>
                                <picker @change="huanzhexingbieChange" :value="huanzhexingbieIndex" :range="huanzhexingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" placeholder="年龄"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>身份证</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='huanzhe'" @tap="huanzhetouxiangTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>头像</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医生工号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishenggonghao" placeholder="医生工号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医生姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengxingming" placeholder="医生姓名"></input>
		</view>
			<view v-if="tableName=='yisheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">所属科室</view>
                                <picker @change="yishengsuoshukeshiChange" :value="yishengsuoshukeshiIndex" :range="yishengsuoshukeshiOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input picker-select-input">{{ruleForm.suoshukeshi?ruleForm.suoshukeshi:"请选择所属科室"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医院名字</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yiyuanmingzi" placeholder="医院名字"></input>
		</view>
			<view v-if="tableName=='yisheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}' class="title">医生性别</view>
                                <picker @change="yishengyishengxingbieChange" :value="yishengyishengxingbieIndex" :range="yishengyishengxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input picker-select-input">{{ruleForm.yishengxingbie?ruleForm.yishengxingbie:"请选择医生性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医生年龄</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengnianling" placeholder="医生年龄"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>联系电话</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.lianxidianhua" placeholder="联系电话"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" class="cu-form-group">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医生邮箱</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengyouxiang" placeholder="医生邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0)","margin":"0","borderStyle":"solid","borderWidth":"0 ","height":"100rpx"}' v-if="tableName=='yisheng'" @tap="yishengyishengzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"25%","fontSize":"26rpx","color":"rgba(68, 68, 68, 1)","textAlign":"center"}'>医生照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-if="ruleForm.yishengzhaopian" style="margin: 0;" class="avator" :src="ruleForm.yishengzhaopian" mode=""></image>
				<image :style='{"width":"80rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"40rpx","textAlign":"left","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: '48%'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(26, 172, 25, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"48%","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: '48%'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(224, 69, 67, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"48%","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				huanzhexingbieOptions: [],
				huanzhexingbieIndex: 0,
				yishengsuoshukeshiOptions: [],
				yishengsuoshukeshiIndex: 0,
				yishengyishengxingbieOptions: [],
				yishengyishengxingbieIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='huanzhe'){
				this.huanzhexingbieOptions = "男,女".split(',');
				this.huanzhexingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.huanzhexingbieIndex = index;
					}
				});
			}
			// 下拉框
			if(this.tableName=='yisheng'){
				res = await this.$api.option(`keshi`,`keshi`,{});
				this.yishengsuoshukeshiOptions = res.data;
				this.yishengsuoshukeshiOptions.forEach((item, index) => {
					if(item==this.ruleForm.suoshukeshi) {
						this.yishengsuoshukeshiIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='yisheng'){
				this.yishengyishengxingbieOptions = "男,女".split(',');
				this.yishengyishengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.yishengxingbie) {
						this.yishengyishengxingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        huanzhexingbieChange(e) {
                                this.huanzhexingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.huanzhexingbieOptions[this.huanzhexingbieIndex]
                        },
                        // 下拉变化
                        yishengsuoshukeshiChange(e) {
                                this.yishengsuoshukeshiIndex = e.target.value
                                this.ruleForm.suoshukeshi = this.yishengsuoshukeshiOptions[this.yishengsuoshukeshiIndex]
                        },
                        // 下拉变化
                        yishengyishengxingbieChange(e) {
                                this.yishengyishengxingbieIndex = e.target.value
                                this.ruleForm.yishengxingbie = this.yishengyishengxingbieOptions[this.yishengyishengxingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.yonghuming) && `huanzhe` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `huanzhe` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if((!this.ruleForm.yishenggonghao) && `yisheng` == this.tableName){
					this.$utils.msg(`医生工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yisheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.yishengnianling&&(!this.$validate.isIntNumer(this.ruleForm.yishengnianling))){
					this.$utils.msg(`医生年龄应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.yishengyouxiang&&(!this.$validate.isEmail(this.ruleForm.yishengyouxiang))){
					this.$utils.msg(`医生邮箱应输入邮件格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,huanzhetouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,yishengyishengzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yishengzhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 80rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 80rpx;
}
</style>
